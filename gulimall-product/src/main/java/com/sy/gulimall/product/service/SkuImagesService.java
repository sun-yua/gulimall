package com.sy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sy.common.utils.PageUtils;
import com.sy.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author sunyua
 * @email sunyua@gmail.com
 * @date 2022-10-09 22:22:50
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

