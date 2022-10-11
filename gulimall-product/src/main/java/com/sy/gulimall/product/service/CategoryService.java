package com.sy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sy.common.utils.PageUtils;
import com.sy.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author sunyua
 * @email sunyua@gmail.com
 * @date 2022-10-09 22:22:50
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

