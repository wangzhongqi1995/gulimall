package com.erosion.gulimall.order.dao;

import com.erosion.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:07:51
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
