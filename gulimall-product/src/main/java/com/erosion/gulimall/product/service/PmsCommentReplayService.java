package com.erosion.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.product.entity.PmsCommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:17:55
 */
public interface PmsCommentReplayService extends IService<PmsCommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

