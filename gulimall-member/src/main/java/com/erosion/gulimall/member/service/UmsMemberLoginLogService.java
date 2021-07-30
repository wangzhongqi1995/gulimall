package com.erosion.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.member.entity.UmsMemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:22:56
 */
public interface UmsMemberLoginLogService extends IService<UmsMemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

