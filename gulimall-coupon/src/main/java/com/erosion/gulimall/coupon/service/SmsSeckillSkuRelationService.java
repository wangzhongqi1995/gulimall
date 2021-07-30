package com.erosion.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.coupon.entity.SmsSeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:24:26
 */
public interface SmsSeckillSkuRelationService extends IService<SmsSeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

