package com.bussanq.group.alpha.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bussanq.group.alpha.bean.UserData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserDataMapper extends BaseMapper<UserData> {

	@Insert("INSERT INTO `user_data`" +
			"        (`url`,`title`,`updatetime`,`userid`)\n" +
			"        select #{url},#{title},now(),#{userid} from dual\n" +
			"        WHERE NOT EXISTS (SELECT 1 FROM user_data WHERE url = #{url} and userid=#{userid} limit 1)")
	public int insertUni(UserData userData);
}