package com.ehl.ece.situation.tfm.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ehl.ece.situation.tfm.bean.Person;
import com.ehl.ece.situation.tfm.common.db.DataBase;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@DataBase
public interface PersonMapper extends BaseMapper<Person> {
	@Select("select t.*,(select c.dmsm from ehl_public.t_sys_person p,ehl_public.t_sys_code c " +
			" where p.xrzw = c.dm and c.dmlb ='0013014' and p.ryid = t.personid) xrzw" +
			" from t_service_person t")
	List<Person> findAll();
}