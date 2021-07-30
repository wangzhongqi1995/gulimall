package com.erosion.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.coupon.entity.SmsHomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:24:26
 */
public interface SmsHomeAdvService extends IService<SmsHomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

