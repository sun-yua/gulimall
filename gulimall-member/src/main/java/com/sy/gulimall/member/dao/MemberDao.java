package com.sy.gulimall.member.dao;

import com.sy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sunyua
 * @email sunyua@gmail.com
 * @date 2022-10-09 23:56:39
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
