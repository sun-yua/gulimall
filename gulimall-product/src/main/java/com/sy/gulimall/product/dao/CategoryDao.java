package com.sy.gulimall.product.dao;

import com.sy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sunyua
 * @email sunyua@gmail.com
 * @date 2022-10-09 22:22:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
