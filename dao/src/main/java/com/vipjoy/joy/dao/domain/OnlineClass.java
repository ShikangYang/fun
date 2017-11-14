package com.vipjoy.joy.dao.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "online_class")
public class OnlineClass {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "able_to_enter_classroom_date_time")
    private Date ableToEnterClassroomDateTime;

    private Boolean archived;

    @Column(name = "attatchDocumentSucess")
    private Byte attatchdocumentsucess;

    private Boolean backup;

    @Column(name = "book_date_time")
    private Date bookDateTime;

    @Column(name = "can_undo_finish")
    private Boolean canUndoFinish;

    private String classroom;

    @Column(name = "consume_class_hour")
    private Boolean consumeClassHour;

    @Column(name = "finish_type")
    private String finishType;

    @Column(name = "last_edit_date_time")
    private Date lastEditDateTime;

    @Column(name = "max_student_number")
    private Integer maxStudentNumber;

    @Column(name = "min_student_number")
    private Integer minStudentNumber;

    @Column(name = "scheduled_date_time")
    private Date scheduledDateTime;

    @Column(name = "serial_number")
    private String serialNumber;

    private String status;

    @Column(name = "student_enter_classroom_date_time")
    private Date studentEnterClassroomDateTime;

    @Column(name = "teacher_enter_classroom_date_time")
    private Date teacherEnterClassroomDateTime;

    @Column(name = "wxt_course_id")
    private String wxtCourseId;

    @Column(name = "creater_id")
    private Long createrId;

    @Column(name = "last_editor_id")
    private Long lastEditorId;

    @Column(name = "lesson_id")
    private Long lessonId;

    @Column(name = "teacher_id")
    private Long teacherId;

    @Column(name = "short_notice")
    private Boolean shortNotice;

    @Column(name = "unit_price")
    private Float unitPrice;

    @Column(name = "is_paid_trail")
    private Boolean isPaidTrail;

    /**
     * 供应商编码
     */
    @Column(name = "supplier_code")
    private String supplierCode;

    @Column(name = "student_changed_tag")
    private Boolean studentChangedTag;

    /**
     * onlineclass类型标示： 0 -- 学生使用的课 1-- practicum课   2--interview课
     */
    @Column(name = "class_type")
    private Short classType;

    @Column(name = "course_id")
    private Long courseId;

    /**
     * 0：默认的值, 1：未匹配老师, 2：已匹配老师, 3：无老师可匹配, 11:未匹配学生, 12：已匹配学生
     */
    @Column(name = "book_type")
    private Byte bookType;

    private String comments;

    @Column(name = "dby_document")
    private String dbyDocument;

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
     * @return able_to_enter_classroom_date_time
     */
    public Date getAbleToEnterClassroomDateTime() {
        return ableToEnterClassroomDateTime;
    }

    /**
     * @param ableToEnterClassroomDateTime
     */
    public void setAbleToEnterClassroomDateTime(Date ableToEnterClassroomDateTime) {
        this.ableToEnterClassroomDateTime = ableToEnterClassroomDateTime;
    }

    /**
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    /**
     * @param archived
     */
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * @return attatchDocumentSucess
     */
    public Byte getAttatchdocumentsucess() {
        return attatchdocumentsucess;
    }

    /**
     * @param attatchdocumentsucess
     */
    public void setAttatchdocumentsucess(Byte attatchdocumentsucess) {
        this.attatchdocumentsucess = attatchdocumentsucess;
    }

    /**
     * @return backup
     */
    public Boolean getBackup() {
        return backup;
    }

    /**
     * @param backup
     */
    public void setBackup(Boolean backup) {
        this.backup = backup;
    }

    /**
     * @return book_date_time
     */
    public Date getBookDateTime() {
        return bookDateTime;
    }

    /**
     * @param bookDateTime
     */
    public void setBookDateTime(Date bookDateTime) {
        this.bookDateTime = bookDateTime;
    }

    /**
     * @return can_undo_finish
     */
    public Boolean getCanUndoFinish() {
        return canUndoFinish;
    }

    /**
     * @param canUndoFinish
     */
    public void setCanUndoFinish(Boolean canUndoFinish) {
        this.canUndoFinish = canUndoFinish;
    }

    /**
     * @return classroom
     */
    public String getClassroom() {
        return classroom;
    }

    /**
     * @param classroom
     */
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    /**
     * @return consume_class_hour
     */
    public Boolean getConsumeClassHour() {
        return consumeClassHour;
    }

    /**
     * @param consumeClassHour
     */
    public void setConsumeClassHour(Boolean consumeClassHour) {
        this.consumeClassHour = consumeClassHour;
    }

    /**
     * @return finish_type
     */
    public String getFinishType() {
        return finishType;
    }

    /**
     * @param finishType
     */
    public void setFinishType(String finishType) {
        this.finishType = finishType;
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
     * @return max_student_number
     */
    public Integer getMaxStudentNumber() {
        return maxStudentNumber;
    }

    /**
     * @param maxStudentNumber
     */
    public void setMaxStudentNumber(Integer maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }

    /**
     * @return min_student_number
     */
    public Integer getMinStudentNumber() {
        return minStudentNumber;
    }

    /**
     * @param minStudentNumber
     */
    public void setMinStudentNumber(Integer minStudentNumber) {
        this.minStudentNumber = minStudentNumber;
    }

    /**
     * @return scheduled_date_time
     */
    public Date getScheduledDateTime() {
        return scheduledDateTime;
    }

    /**
     * @param scheduledDateTime
     */
    public void setScheduledDateTime(Date scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
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
     * @return student_enter_classroom_date_time
     */
    public Date getStudentEnterClassroomDateTime() {
        return studentEnterClassroomDateTime;
    }

    /**
     * @param studentEnterClassroomDateTime
     */
    public void setStudentEnterClassroomDateTime(Date studentEnterClassroomDateTime) {
        this.studentEnterClassroomDateTime = studentEnterClassroomDateTime;
    }

    /**
     * @return teacher_enter_classroom_date_time
     */
    public Date getTeacherEnterClassroomDateTime() {
        return teacherEnterClassroomDateTime;
    }

    /**
     * @param teacherEnterClassroomDateTime
     */
    public void setTeacherEnterClassroomDateTime(Date teacherEnterClassroomDateTime) {
        this.teacherEnterClassroomDateTime = teacherEnterClassroomDateTime;
    }

    /**
     * @return wxt_course_id
     */
    public String getWxtCourseId() {
        return wxtCourseId;
    }

    /**
     * @param wxtCourseId
     */
    public void setWxtCourseId(String wxtCourseId) {
        this.wxtCourseId = wxtCourseId;
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
     * @return lesson_id
     */
    public Long getLessonId() {
        return lessonId;
    }

    /**
     * @param lessonId
     */
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * @return teacher_id
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * @param teacherId
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * @return short_notice
     */
    public Boolean getShortNotice() {
        return shortNotice;
    }

    /**
     * @param shortNotice
     */
    public void setShortNotice(Boolean shortNotice) {
        this.shortNotice = shortNotice;
    }

    /**
     * @return unit_price
     */
    public Float getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice
     */
    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return is_paid_trail
     */
    public Boolean getIsPaidTrail() {
        return isPaidTrail;
    }

    /**
     * @param isPaidTrail
     */
    public void setIsPaidTrail(Boolean isPaidTrail) {
        this.isPaidTrail = isPaidTrail;
    }

    /**
     * 获取供应商编码
     *
     * @return supplier_code - 供应商编码
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 设置供应商编码
     *
     * @param supplierCode 供应商编码
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    /**
     * @return student_changed_tag
     */
    public Boolean getStudentChangedTag() {
        return studentChangedTag;
    }

    /**
     * @param studentChangedTag
     */
    public void setStudentChangedTag(Boolean studentChangedTag) {
        this.studentChangedTag = studentChangedTag;
    }

    /**
     * 获取onlineclass类型标示： 0 -- 学生使用的课 1-- practicum课   2--interview课
     *
     * @return class_type - onlineclass类型标示： 0 -- 学生使用的课 1-- practicum课   2--interview课
     */
    public Short getClassType() {
        return classType;
    }

    /**
     * 设置onlineclass类型标示： 0 -- 学生使用的课 1-- practicum课   2--interview课
     *
     * @param classType onlineclass类型标示： 0 -- 学生使用的课 1-- practicum课   2--interview课
     */
    public void setClassType(Short classType) {
        this.classType = classType;
    }

    /**
     * @return course_id
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * @param courseId
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * 获取0：默认的值, 1：未匹配老师, 2：已匹配老师, 3：无老师可匹配, 11:未匹配学生, 12：已匹配学生
     *
     * @return book_type - 0：默认的值, 1：未匹配老师, 2：已匹配老师, 3：无老师可匹配, 11:未匹配学生, 12：已匹配学生
     */
    public Byte getBookType() {
        return bookType;
    }

    /**
     * 设置0：默认的值, 1：未匹配老师, 2：已匹配老师, 3：无老师可匹配, 11:未匹配学生, 12：已匹配学生
     *
     * @param bookType 0：默认的值, 1：未匹配老师, 2：已匹配老师, 3：无老师可匹配, 11:未匹配学生, 12：已匹配学生
     */
    public void setBookType(Byte bookType) {
        this.bookType = bookType;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return dby_document
     */
    public String getDbyDocument() {
        return dbyDocument;
    }

    /**
     * @param dbyDocument
     */
    public void setDbyDocument(String dbyDocument) {
        this.dbyDocument = dbyDocument;
    }
}