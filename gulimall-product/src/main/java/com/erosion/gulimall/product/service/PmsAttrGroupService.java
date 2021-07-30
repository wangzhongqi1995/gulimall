package com.erosion.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.product.entity.PmsAttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:17:55
 */
public interface PmsAttrGroupService extends IService<PmsAttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

