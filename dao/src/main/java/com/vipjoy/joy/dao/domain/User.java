package com.vipjoy.joy.dao.domain;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DTYPE")
    private String dtype;

    @Column(name = "create_date_time")
    private Date createDateTime;

    private String gender;

    @Column(name = "last_edit_date_time")
    private Date lastEditDateTime;

    @Column(name = "last_login_date_time")
    private Date lastLoginDateTime;

    private String name;

    private String password;

    @Column(name = "register_date_time")
    private Date registerDateTime;

    private String roles;

    private String status;

    private String token;

    private String username;

    @Column(name = "creater_id")
    private Long createrId;

    @Column(name = "last_editor_id")
    private Long lastEditorId;

    @Column(name = "init_password")
    private String initPassword;

    @Column(name = "account_type")
    private String accountType;

    /**
     * 是否第一次登录
     */
    @Column(name = "isFirstLogin")
    private String isfirstlogin;

    @Column(name = "username_skey")
    private String usernameSkey;

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
     * @return DTYPE
     */
    public String getDtype() {
        return dtype;
    }

    /**
     * @param dtype
     */
    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    /**
     * @return create_date_time
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**
     * @param createDateTime
     */
    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return last_edit_date_time
     */
    public Date getLastEditDateTime() {
        return lastEditDateTime;
    }

    /**
     * @param lastEditDateTime
     */
    public void setLastEditDateTime(Date lastEditDateTime) {
        this.lastEditDateTime = lastEditDateTime;
    }

    /**
     * @return last_login_date_time
     */
    public Date getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    /**
     * @param lastLoginDateTime
     */
    public void setLastLoginDateTime(Date lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return register_date_time
     */
    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    /**
     * @param registerDateTime
     */
    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    /**
     * @return roles
     */
    public String getRoles() {
        return roles;
    }

    /**
     * @param roles
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return creater_id
     */
    public Long getCreaterId() {
        return createrId;
    }

    /**
     * @param createrId
     */
    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    /**
     * @return last_editor_id
     */
    public Long getLastEditorId() {
        return lastEditorId;
    }

    /**
     * @param lastEditorId
     */
    public void setLastEditorId(Long lastEditorId) {
        this.lastEditorId = lastEditorId;
    }

    /**
     * @return init_password
     */
    public String getInitPassword() {
        return initPassword;
    }

    /**
     * @param initPassword
     */
    public void setInitPassword(String initPassword) {
        this.initPassword = initPassword;
    }

    /**
     * @return account_type
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取是否第一次登录
     *
     * @return isFirstLogin - 是否第一次登录
     */
    public String getIsfirstlogin() {
        return isfirstlogin;
    }

    /**
     * 设置是否第一次登录
     *
     * @param isfirstlogin 是否第一次登录
     */
    public void setIsfirstlogin(String isfirstlogin) {
        this.isfirstlogin = isfirstlogin;
    }

    /**
     * @return username_skey
     */
    public String getUsernameSkey() {
        return usernameSkey;
    }

    /**
     * @param usernameSkey
     */
    public void setUsernameSkey(String usernameSkey) {
        this.usernameSkey = usernameSkey;
    }
}