package com.erosion.gulimall.product.dao;

import com.erosion.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 22:33:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
