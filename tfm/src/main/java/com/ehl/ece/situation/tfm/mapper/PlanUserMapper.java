package com.ehl.ece.situation.tfm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ehl.ece.situation.tfm.bean.PlanUser;
import com.ehl.ece.situation.tfm.common.db.DataBase;
import org.springframework.stereotype.Component;

@Component
@DataBase
public interface PlanUserMapper  extends BaseMapper<PlanUser> {

}