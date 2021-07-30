package com.erosion.gulimall.order.dao;

import com.erosion.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:07:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
