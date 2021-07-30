package com.erosion.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.erosion.common.utils.PageUtils;
import com.erosion.gulimall.ware.entity.WmsWareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:21:28
 */
public interface WmsWareInfoService extends IService<WmsWareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

