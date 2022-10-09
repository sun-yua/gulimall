package com.sy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sy.common.utils.PageUtils;
import com.sy.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author sunyua
 * @email sunyua@gmail.com
 * @date 2022-10-09 22:22:50
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

