package com.erosion.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.member.entity.UmsIntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:22:57
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

