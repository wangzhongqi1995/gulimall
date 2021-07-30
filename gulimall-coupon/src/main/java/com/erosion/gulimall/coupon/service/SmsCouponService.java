package com.erosion.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.coupon.entity.SmsCouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:24:27
 */
public interface SmsCouponService extends IService<SmsCouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

