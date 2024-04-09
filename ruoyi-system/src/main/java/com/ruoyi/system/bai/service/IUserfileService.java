package com.ruoyi.system.bai.service;

import com.ruoyi.system.bai.domain.Userfile;

import java.util.List;

/**
 * 文件Service接口
 *
 * @author bai
 * @date 2024-04-09
 */
public interface IUserfileService
{
    /**
     * 查询文件
     *
     * @param userFileId 文件主键
     * @return 文件
     */
    public Userfile selectUserfileByUserFileId(String userFileId);

    /**
     * 查询文件列表
     *
     * @param userfile 文件
     * @return 文件集合
     */
    public List<Userfile> selectUserfileList(Userfile userfile);

    /**
     * 新增文件
     *
     * @param userfile 文件
     * @return 结果
     */
    public int insertUserfile(Userfile userfile);

    /**
     * 修改文件
     *
     * @param userfile 文件
     * @return 结果
     */
    public int updateUserfile(Userfile userfile);

    /**
     * 批量删除文件
     *
     * @param userFileIds 需要删除的文件主键集合
     * @return 结果
     */
    public int deleteUserfileByUserFileIds(String[] userFileIds);

    /**
     * 删除文件信息
     *
     * @param userFileId 文件主键
     * @return 结果
     */
    public int deleteUserfileByUserFileId(String userFileId);
}
