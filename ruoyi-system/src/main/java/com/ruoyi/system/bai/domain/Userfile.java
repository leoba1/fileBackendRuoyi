package com.ruoyi.system.bai.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文件对象 userfile
 *
 * @author bai
 * @date 2024-04-09
 */
public class Userfile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户文件ID */
    @Excel(name = "用户文件ID")
    private String userFileId;

    /** 创建用户id */
    @Excel(name = "创建用户id")
    private String createUserId;

    /** 删除批次号 */
    private String deleteBatchNum;

    /** 删除标识(0-未删除，1-已删除) */
    @Excel(name = "删除标识(0-未删除，1-已删除)")
    private Long deleteFlag;

    /** 删除时间 */
    @Excel(name = "删除时间")
    private String deleteTime;

    /** 扩展名 */
    private String extendName;

    /** 文件id */
    private String fileId;

    /** 文件名 */
    @Excel(name = "文件名")
    private String fileName;

    /** 文件路径 */
    private String filePath;

    /** 是否是目录(0-否,1-是) */
    private Long isDir;

    /** 修改时间 */
    private String modifyTime;

    /** 修改用户id */
    private String modifyUserId;

    /** 修改时间 */
    @Excel(name = "修改时间")
    private String uploadTime;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    public void setUserFileId(String userFileId)
    {
        this.userFileId = userFileId;
    }

    public String getUserFileId()
    {
        return userFileId;
    }
    public void setCreateUserId(String createUserId)
    {
        this.createUserId = createUserId;
    }

    public String getCreateUserId()
    {
        return createUserId;
    }
    public void setDeleteBatchNum(String deleteBatchNum)
    {
        this.deleteBatchNum = deleteBatchNum;
    }

    public String getDeleteBatchNum()
    {
        return deleteBatchNum;
    }
    public void setDeleteFlag(Long deleteFlag)
    {
        this.deleteFlag = deleteFlag;
    }

    public Long getDeleteFlag()
    {
        return deleteFlag;
    }
    public void setDeleteTime(String deleteTime)
    {
        this.deleteTime = deleteTime;
    }

    public String getDeleteTime()
    {
        return deleteTime;
    }
    public void setExtendName(String extendName)
    {
        this.extendName = extendName;
    }

    public String getExtendName()
    {
        return extendName;
    }
    public void setFileId(String fileId)
    {
        this.fileId = fileId;
    }

    public String getFileId()
    {
        return fileId;
    }
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFileName()
    {
        return fileName;
    }
    public void setFilePath(String filePath)
    {
        this.filePath = filePath;
    }

    public String getFilePath()
    {
        return filePath;
    }
    public void setIsDir(Long isDir)
    {
        this.isDir = isDir;
    }

    public Long getIsDir()
    {
        return isDir;
    }
    public void setModifyTime(String modifyTime)
    {
        this.modifyTime = modifyTime;
    }

    public String getModifyTime()
    {
        return modifyTime;
    }
    public void setModifyUserId(String modifyUserId)
    {
        this.modifyUserId = modifyUserId;
    }

    public String getModifyUserId()
    {
        return modifyUserId;
    }
    public void setUploadTime(String uploadTime)
    {
        this.uploadTime = uploadTime;
    }

    public String getUploadTime()
    {
        return uploadTime;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userFileId", getUserFileId())
            .append("createTime", getCreateTime())
            .append("createUserId", getCreateUserId())
            .append("deleteBatchNum", getDeleteBatchNum())
            .append("deleteFlag", getDeleteFlag())
            .append("deleteTime", getDeleteTime())
            .append("extendName", getExtendName())
            .append("fileId", getFileId())
            .append("fileName", getFileName())
            .append("filePath", getFilePath())
            .append("isDir", getIsDir())
            .append("modifyTime", getModifyTime())
            .append("modifyUserId", getModifyUserId())
            .append("uploadTime", getUploadTime())
            .append("userId", getUserId())
            .toString();
    }
}
