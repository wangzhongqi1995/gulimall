package com.erosion.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.ware.entity.WmsWareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:21:28
 */
public interface WmsWareOrderTaskService extends IService<WmsWareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

