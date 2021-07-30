package com.erosion.gulimall.member.dao;

import com.erosion.gulimall.member.entity.UmsMemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 19:22:56
 */
@Mapper
public interface UmsMemberDao extends BaseMapper<UmsMemberEntity> {
	
}
