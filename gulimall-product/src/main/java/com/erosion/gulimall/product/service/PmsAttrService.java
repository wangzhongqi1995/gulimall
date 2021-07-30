package com.erosion.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.product.entity.PmsAttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:17:55
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

