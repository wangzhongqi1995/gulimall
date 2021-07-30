package com.erosion.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.product.entity.PmsSkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:17:54
 */
public interface PmsSkuImagesService extends IService<PmsSkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

