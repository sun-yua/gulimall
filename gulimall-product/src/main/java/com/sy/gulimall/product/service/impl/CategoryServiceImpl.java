package com.sy.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sy.common.utils.PageUtils;
import com.sy.common.utils.Query;
import com.sy.gulimall.product.dao.CategoryDao;
import com.sy.gulimall.product.entity.CategoryEntity;
import com.sy.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Resource
    private CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntityList = categoryDao.selectList(null);
        categoryEntityList.stream().filter(res -> res.getParentCid() == 0).map(res -> {
            res.setChildren(getChildrens(res , categoryEntityList));
            return res;
        }).sorted((menu1 , menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return categoryEntityList;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity categoryEntity , List<CategoryEntity> categoryEntityList) {
        List<CategoryEntity> children = categoryEntityList.stream().filter(res ->
            res.getParentCid() == categoryEntity.getCatId()
        ).map(res -> {
            res.setChildren(getChildrens(res , categoryEntityList));
            return res;
        }).sorted((menu1 , menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}