package com.erosion.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.coupon.entity.SmsCouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:24:27
 */
public interface SmsCouponHistoryService extends IService<SmsCouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

