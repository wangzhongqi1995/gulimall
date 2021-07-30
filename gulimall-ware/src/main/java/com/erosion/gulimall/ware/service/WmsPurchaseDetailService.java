package com.erosion.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.ware.entity.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:21:28
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

