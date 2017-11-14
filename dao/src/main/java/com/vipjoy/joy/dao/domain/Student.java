package com.vipjoy.joy.dao.domain;

import java.util.Date;
import javax.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "base_class_salary")
    private Float baseClassSalary;

    @Column(name = "create_date_time")
    private Date createDateTime;

    private String description;

    private Boolean free;

    private String mode;

    private String name;

    @Column(name = "need_backup_teacher")
    private Boolean needBackupTeacher;

    private Boolean sequential;

    @Column(name = "serial_number")
    private String serialNumber;

    private String type;

    @Column(name = "entry_unit_id")
    private Long entryUnitId;

    @Column(name = "show_name")
    private String showName;

    /**
     * 下级节点类型,e.g. level,unit
     */
    @Column(name = "childType")
    private String childtype;

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
     * @return base_class_salary
     */
    public Float getBaseClassSalary() {
        return baseClassSalary;
    }

    /**
     * @param baseClassSalary
     */
    public void setBaseClassSalary(Float baseClassSalary) {
        this.baseClassSalary = baseClassSalary;
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
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return free
     */
    public Boolean getFree() {
        return free;
    }

    /**
     * @param free
     */
    public void setFree(Boolean free) {
        this.free = free;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * @param mode
     */
    public void setMode(String mode) {
        this.mode = mode;
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
     * @return need_backup_teacher
     */
    public Boolean getNeedBackupTeacher() {
        return needBackupTeacher;
    }

    /**
     * @param needBackupTeacher
     */
    public void setNeedBackupTeacher(Boolean needBackupTeacher) {
        this.needBackupTeacher = needBackupTeacher;
    }

    /**
     * @return sequential
     */
    public Boolean getSequential() {
        return sequential;
    }

    /**
     * @param sequential
     */
    public void setSequential(Boolean sequential) {
        this.sequential = sequential;
    }

    /**
     * @return serial_number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return entry_unit_id
     */
    public Long getEntryUnitId() {
        return entryUnitId;
    }

    /**
     * @param entryUnitId
     */
    public void setEntryUnitId(Long entryUnitId) {
        this.entryUnitId = entryUnitId;
    }

    /**
     * @return show_name
     */
    public String getShowName() {
        return showName;
    }

    /**
     * @param showName
     */
    public void setShowName(String showName) {
        this.showName = showName;
    }

    /**
     * 获取下级节点类型,e.g. level,unit
     *
     * @return childType - 下级节点类型,e.g. level,unit
     */
    public String getChildtype() {
        return childtype;
    }

    /**
     * 设置下级节点类型,e.g. level,unit
     *
     * @param childtype 下级节点类型,e.g. level,unit
     */
    public void setChildtype(String childtype) {
        this.childtype = childtype;
    }
}