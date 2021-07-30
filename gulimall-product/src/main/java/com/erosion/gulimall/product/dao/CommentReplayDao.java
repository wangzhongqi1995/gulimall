package com.erosion.gulimall.product.dao;

import com.erosion.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 22:33:29
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
