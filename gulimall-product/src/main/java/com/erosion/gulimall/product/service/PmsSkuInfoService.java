package com.erosion.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.product.entity.PmsSkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:17:55
 */
public interface PmsSkuInfoService extends IService<PmsSkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

