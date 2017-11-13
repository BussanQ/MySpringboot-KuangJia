package com.ehl.ece.situation.tfm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ehl.ece.situation.tfm.bean.AlarmInfo;
import com.ehl.ece.situation.tfm.common.db.DataBase;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@DataBase
public interface AlarmInfoMapper extends BaseMapper<AlarmInfo> {

    @Select( "select alarmaddress,alarmdesc,alarmid,alarmperson,alarmpersontel,alarmregionid,alarmtime," +
            "alarmunit,eventlevel,eventsource,eventstate,eventthintype,eventtype,jcsj,latitude,linkid,longitude,mark,sbbh,sbly,updatetime," +
            "(select a.jgmc from ehl_public.t_sys_department a where  a.jgid= alarmregionid ) alarmregion " +
            "from T_IN_TEDS_EVENT t where  t.alarmtime> to_date(#{endTime}, 'yyyy-MM-dd HH24:mi:ss')  order by t.alarmtime desc ")
    List<AlarmInfo> findBytime(String time);

    @Select(
            "select alarmaddress,alarmdesc,alarmid,alarmperson,alarmpersontel,alarmregionid,alarmtime," +
                    "alarmunit,eventlevel,eventsource,eventstate,eventthintype,eventtype,jcsj,latitude,linkid,longitude,mark,sbbh,sbly,updatetime," +
            "(select a.jgmc from ehl_public.t_sys_department a where  a.jgid= alarmregionid ) alarmregion " +
            "from T_IN_TEDS_EVENT t order by alarmtime desc ")
    List<AlarmInfo> findAll();
}