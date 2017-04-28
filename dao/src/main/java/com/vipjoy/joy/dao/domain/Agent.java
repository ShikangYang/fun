package com.vipjoy.joy.dao.domain;

import java.util.Date;
import javax.persistence.*;

public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 代理商名称
     */
    private String name;

    /**
     * 登录账号
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 账号类型
     */
    @Column(name = "account_type")
    private Byte accountType;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 0 删除
1 正常
     */
    private Boolean status;

    /**
     * 0 禁用
1 正常
     */
    private Boolean enable;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取代理商名称
     *
     * @return name - 代理商名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置代理商名称
     *
     * @param name 代理商名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取登录账号
     *
     * @return account_name - 登录账号
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置登录账号
     *
     * @param accountName 登录账号
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取账号类型
     *
     * @return account_type - 账号类型
     */
    public Byte getAccountType() {
        return accountType;
    }

    /**
     * 设置账号类型
     *
     * @param accountType 账号类型
     */
    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取0 删除
1 正常
     *
     * @return status - 0 删除
1 正常
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置0 删除
1 正常
     *
     * @param status 0 删除
1 正常
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取0 禁用
1 正常
     *
     * @return enable - 0 禁用
1 正常
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * 设置0 禁用
1 正常
     *
     * @param enable 0 禁用
1 正常
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}