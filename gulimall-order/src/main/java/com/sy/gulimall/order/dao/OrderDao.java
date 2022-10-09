package com.sy.gulimall.order.dao;

import com.sy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sunyua
 * @email sunyua@gmail.com
 * @date 2022-10-10 00:00:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
