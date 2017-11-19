package com.bussnaq.group.alpha.service;

import com.bussnaq.group.alpha.bean.User;
import com.bussnaq.group.alpha.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户，一般来说需要检查用户为空、用户名为空、密码为空
     */
    public void add(User user) throws Exception {
    	int result = 0; //受影响的行数默认为0
        try {
            result = userMapper.insert(user);
        } catch (Exception e) {
            System.out.println("添加用户失败,用户已经存在");
            //其他用户添加失败异常
            throw new Exception(e);
        }
        if (result > 0)
            System.out.println("添加用户成功");
    }
    
    public List<User> findAll(int pageNum, int pageSize,int id,Date time ) {
        return null;
    }
    
    public List<User> findAll(int pageNum, int pageSize){
    	return null;
    }
    
    /**
     * 查找用户
     *
     * @param user 用户bean
     * @throws Exception
     */
    public User findUser(User user) {
        return userMapper.selectById(user.getLoginId());
    }
    
    public void updateLoginSession(String sessionId, String loginId) {
        userMapper.updateSession(sessionId, loginId);
    }
}
