package com.erosion.gulimall.product.dao;

import com.erosion.gulimall.product.entity.PmsCategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:17:55
 */
@Mapper
public interface PmsCategoryDao extends BaseMapper<PmsCategoryEntity> {
	
}
