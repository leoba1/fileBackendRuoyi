package com.ruoyi.system.bai.mapper;

import java.util.List;
import com.ruoyi.system.bai.domain.User;

/**
 * 用户Mapper接口
 *
 * @author bai
 * @date 2024-01-27
 */
public interface UserMapper
{

    public User selectUserByUserId(String userId);


    public List<User> selectUserList(User user);


    public int insertUser(User user);


    public int updateUser(User user);


    public int deleteUserByUserId(String userId);


    public int deleteUserByUserIds(String[] userIds);

    public int changeAva(String id);
}
