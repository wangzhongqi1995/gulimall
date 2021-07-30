package com.erosion.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.product.entity.PmsProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:17:54
 */
public interface PmsProductAttrValueService extends IService<PmsProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

