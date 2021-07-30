package com.erosion.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.product.entity.PmsSpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:17:54
 */
public interface PmsSpuInfoDescService extends IService<PmsSpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

