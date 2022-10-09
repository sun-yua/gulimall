package com.sy.gulimall.coupon.dao;

import com.sy.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sunyua
 * @email sunyua@gmail.com
 * @date 2022-10-09 23:46:21
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
