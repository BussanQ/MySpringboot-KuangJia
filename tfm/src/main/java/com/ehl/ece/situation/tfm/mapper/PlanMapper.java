package com.ehl.ece.situation.tfm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ehl.ece.situation.tfm.bean.Plan;
import com.ehl.ece.situation.tfm.common.db.DataBase;
import org.springframework.stereotype.Component;

@Component
@DataBase
public interface PlanMapper  extends BaseMapper<Plan> {

}