package com.ruoyi.system.bai.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.bai.mapper.UserMapper;
import com.ruoyi.system.bai.domain.User;
import com.ruoyi.system.bai.service.IUserService;

/**
 * 用户Service业务层处理
 *
 * @author bai
 * @date 2024-01-27
 */
@Service
public class UserServiceImpl implements IUserService
{
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户
     *
     * @param userId 用户主键
     * @return 用户
     */
    @Override
    public User selectUserByUserId(String userId)
    {
        return userMapper.selectUserByUserId(userId);
    }

    /**
     * 查询用户列表
     *
     * @param user 用户
     * @return 用户
     */
    @Override
    public List<User> selectUserList(User user)
    {
        return userMapper.selectUserList(user);
    }

    /**
     * 新增用户
     *
     * @param user 用户
     * @return 结果
     */
    @Override
    public int insertUser(User user)
    {
        return userMapper.insertUser(user);
    }

    /**
     * 修改用户
     *
     * @param user 用户
     * @return 结果
     */
    @Override
    public int updateUser(User user)
    {
        return userMapper.updateUser(user);
    }

    /**
     * 批量删除用户
     *
     * @param userIds 需要删除的用户主键
     * @return 结果
     */
    @Override
    public int deleteUserByUserIds(String[] userIds)
    {
        return userMapper.deleteUserByUserIds(userIds);
    }

    /**
     * 删除用户信息
     *
     * @param userId 用户主键
     * @return 结果
     */
    @Override
    public int deleteUserByUserId(String userId)
    {
        return userMapper.deleteUserByUserId(userId);
    }

    @Override
    public void changeAva(String id) {
        userMapper.changeAva(id);
    }
}
