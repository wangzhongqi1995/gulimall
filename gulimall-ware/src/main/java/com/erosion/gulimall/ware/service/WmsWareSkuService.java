package com.erosion.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.ware.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:21:27
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

