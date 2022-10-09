package com.sy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sy.common.utils.PageUtils;
import com.sy.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author sunyua
 * @email sunyua@gmail.com
 * @date 2022-10-09 23:56:39
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

