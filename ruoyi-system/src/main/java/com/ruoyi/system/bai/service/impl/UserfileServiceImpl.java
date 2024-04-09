package com.ruoyi.system.bai.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.bai.domain.Userfile;
import com.ruoyi.system.bai.mapper.UserfileMapper;
import com.ruoyi.system.bai.service.IUserfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文件Service业务层处理
 *
 * @author bai
 * @date 2024-04-09
 */
@Service
public class UserfileServiceImpl implements IUserfileService
{
    @Autowired
    private UserfileMapper userfileMapper;

    /**
     * 查询文件
     *
     * @param userFileId 文件主键
     * @return 文件
     */
    @Override
    public Userfile selectUserfileByUserFileId(String userFileId)
    {
        return userfileMapper.selectUserfileByUserFileId(userFileId);
    }

    /**
     * 查询文件列表
     *
     * @param userfile 文件
     * @return 文件
     */
    @Override
    public List<Userfile> selectUserfileList(Userfile userfile)
    {
        return userfileMapper.selectUserfileList(userfile);
    }

    /**
     * 新增文件
     *
     * @param userfile 文件
     * @return 结果
     */
    @Override
    public int insertUserfile(Userfile userfile)
    {
        userfile.setCreateTime(DateUtils.getNowDate());
        return userfileMapper.insertUserfile(userfile);
    }

    /**
     * 修改文件
     *
     * @param userfile 文件
     * @return 结果
     */
    @Override
    public int updateUserfile(Userfile userfile)
    {
        return userfileMapper.updateUserfile(userfile);
    }

    /**
     * 批量删除文件
     *
     * @param userFileIds 需要删除的文件主键
     * @return 结果
     */
    @Override
    public int deleteUserfileByUserFileIds(String[] userFileIds)
    {
        return userfileMapper.deleteUserfileByUserFileIds(userFileIds);
    }

    /**
     * 删除文件信息
     *
     * @param userFileId 文件主键
     * @return 结果
     */
    @Override
    public int deleteUserfileByUserFileId(String userFileId)
    {
        return userfileMapper.deleteUserfileByUserFileId(userFileId);
    }
}
