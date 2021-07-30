package com.erosion.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.coupon.entity.SmsSeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:24:26
 */
public interface SmsSeckillSessionService extends IService<SmsSeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

