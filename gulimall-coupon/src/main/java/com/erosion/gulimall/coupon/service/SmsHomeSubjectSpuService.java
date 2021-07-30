package com.erosion.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.coupon.entity.SmsHomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:24:26
 */
public interface SmsHomeSubjectSpuService extends IService<SmsHomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

