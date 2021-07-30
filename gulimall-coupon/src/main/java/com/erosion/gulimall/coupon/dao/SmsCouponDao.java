package com.erosion.gulimall.coupon.dao;

import com.erosion.gulimall.coupon.entity.SmsCouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:24:27
 */
@Mapper
public interface SmsCouponDao extends BaseMapper<SmsCouponEntity> {
	
}
