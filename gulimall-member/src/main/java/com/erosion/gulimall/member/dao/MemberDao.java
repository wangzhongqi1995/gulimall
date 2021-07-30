package com.erosion.gulimall.member.dao;

import com.erosion.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * @author wangzhongqi
 * @email wangzhongqi95@gmail.com
 * @date 2021-07-30 22:35:26
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
