package com.erosion.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.coupon.entity.SmsMemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:24:26
 */
public interface SmsMemberPriceService extends IService<SmsMemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

