package com.bussanq.group.alpha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bussanq.group.alpha.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper extends BaseMapper<User> {
	@Update("update user set session_id = #{sessionId} where login_id = #{loginId}")
	public int updateSession(String sessionId,String loginId);
}