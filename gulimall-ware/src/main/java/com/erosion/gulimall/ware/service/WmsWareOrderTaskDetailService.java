package com.erosion.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.ware.entity.WmsWareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:21:27
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

