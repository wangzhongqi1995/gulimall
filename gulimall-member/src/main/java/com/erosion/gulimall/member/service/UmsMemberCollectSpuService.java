package com.erosion.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.member.entity.UmsMemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:22:56
 */
public interface UmsMemberCollectSpuService extends IService<UmsMemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

