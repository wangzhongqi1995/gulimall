package com.erosion.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.member.entity.UmsMemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:22:56
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

