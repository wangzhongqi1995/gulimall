package com.erosion.gulimall.coupon.dao;

import com.erosion.gulimall.coupon.entity.SmsCouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:24:26
 */
@Mapper
public interface SmsCouponSpuRelationDao extends BaseMapper<SmsCouponSpuRelationEntity> {
	
}
