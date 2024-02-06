package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户管理对象 user
 * 
 * @author ruoyi
 * @date 2024-01-20
 */
public class User extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String userId;

    /** 区 */
    @Excel(name = "区")
    private String addrArea;

    /** 市 */
    @Excel(name = "市")
    private String addrCity;

    /** 省 */
    @Excel(name = "省")
    private String addrProvince;

    /** 是否可用(0-不可用,1-可用) */
    @Excel(name = "是否可用(0-不可用,1-可用)")
    private Long available;

    /** 生日 */
    @Excel(name = "生日")
    private String birthday;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 头像 */
    @Excel(name = "头像")
    private String imageUrl;

    /** 行业 */
    @Excel(name = "行业")
    private String industry;

    /** 个人简介 */
    @Excel(name = "个人简介")
    private String intro;

    /** 最后登录时间 */
    @Excel(name = "最后登录时间")
    private String lastLoginTime;

    /** 修改时间 */
    @Excel(name = "修改时间")
    private String modifyTime;

    /** 修改用户id */
    @Excel(name = "修改用户id")
    private Long modifyUserId;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 地区 */
    @Excel(name = "地区")
    private String position;

    /** 注册时间 */
    @Excel(name = "注册时间")
    private String registerTime;

    /** 盐 */
    @Excel(name = "盐")
    private String salt;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 手机号 */
    @Excel(name = "手机号")
    private String telephone;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** open id */
    @Excel(name = "open id")
    private String wxOpenId;

    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setAddrArea(String addrArea) 
    {
        this.addrArea = addrArea;
    }

    public String getAddrArea() 
    {
        return addrArea;
    }
    public void setAddrCity(String addrCity) 
    {
        this.addrCity = addrCity;
    }

    public String getAddrCity() 
    {
        return addrCity;
    }
    public void setAddrProvince(String addrProvince) 
    {
        this.addrProvince = addrProvince;
    }

    public String getAddrProvince() 
    {
        return addrProvince;
    }
    public void setAvailable(Long available) 
    {
        this.available = available;
    }

    public Long getAvailable() 
    {
        return available;
    }
    public void setBirthday(String birthday) 
    {
        this.birthday = birthday;
    }

    public String getBirthday() 
    {
        return birthday;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setImageUrl(String imageUrl) 
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() 
    {
        return imageUrl;
    }
    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
    }
    public void setIntro(String intro) 
    {
        this.intro = intro;
    }

    public String getIntro() 
    {
        return intro;
    }
    public void setLastLoginTime(String lastLoginTime) 
    {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginTime() 
    {
        return lastLoginTime;
    }
    public void setModifyTime(String modifyTime) 
    {
        this.modifyTime = modifyTime;
    }

    public String getModifyTime() 
    {
        return modifyTime;
    }
    public void setModifyUserId(Long modifyUserId) 
    {
        this.modifyUserId = modifyUserId;
    }

    public Long getModifyUserId() 
    {
        return modifyUserId;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setRegisterTime(String registerTime) 
    {
        this.registerTime = registerTime;
    }

    public String getRegisterTime() 
    {
        return registerTime;
    }
    public void setSalt(String salt) 
    {
        this.salt = salt;
    }

    public String getSalt() 
    {
        return salt;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setTelephone(String telephone) 
    {
        this.telephone = telephone;
    }

    public String getTelephone() 
    {
        return telephone;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setWxOpenId(String wxOpenId) 
    {
        this.wxOpenId = wxOpenId;
    }

    public String getWxOpenId() 
    {
        return wxOpenId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("addrArea", getAddrArea())
            .append("addrCity", getAddrCity())
            .append("addrProvince", getAddrProvince())
            .append("available", getAvailable())
            .append("birthday", getBirthday())
            .append("email", getEmail())
            .append("imageUrl", getImageUrl())
            .append("industry", getIndustry())
            .append("intro", getIntro())
            .append("lastLoginTime", getLastLoginTime())
            .append("modifyTime", getModifyTime())
            .append("modifyUserId", getModifyUserId())
            .append("password", getPassword())
            .append("position", getPosition())
            .append("registerTime", getRegisterTime())
            .append("salt", getSalt())
            .append("sex", getSex())
            .append("telephone", getTelephone())
            .append("username", getUsername())
            .append("wxOpenId", getWxOpenId())
            .toString();
    }
}
