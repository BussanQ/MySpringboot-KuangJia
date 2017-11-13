package com.ehl.ece.situation.tfm.publicMapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ehl.ece.situation.tfm.bean.EquipmentRunstate;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EquipmentMapper extends BaseMapper<EquipmentRunstate> {
	@Select("select (select name from t_dic_tircp_code where typeid='2009001' and id=a.sblx ) name, a.sblx type, b.normalCount, a.totalCount, to_char(sysdate,'yyyy-MM-dd HH24:mi:ss') datetime "+
			" from (select sblx, count(sblx) totalCount "+
			" from T_IN_OMS_CURR_STATUS t "+
			" group by sblx) a "+
			" left join (select sblx, sbzt, count(sbzt) normalCount "+
			" from T_IN_OMS_CURR_STATUS t "+
			" where sbzt = 'Online' "+
			" group by sblx, sbzt) b "+
			" on a.sblx = b.sblx")
	List<EquipmentRunstate> findAll();
}