package com.vipjoy.joy.dao.domain;

import java.util.Date;
import javax.persistence.*;

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private String avatar;

    @Column(name = "bank_account_name")
    private String bankAccountName;

    @Column(name = "bank_address")
    private String bankAddress;

    @Column(name = "bank_card_number")
    private String bankCardNumber;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_swift_code")
    private String bankSwiftCode;

    /**
     * ABA routing number
     */
    @Column(name = "bank_aba_routing_number")
    private String bankAbaRoutingNumber;

    /**
     * ACH number
     */
    @Column(name = "bank_ach_number")
    private String bankAchNumber;

    private Date birthday;

    @Column(name = "contract_end_date")
    private Date contractEndDate;

    @Column(name = "contract_start_date")
    private Date contractStartDate;

    @Column(name = "entry_date")
    private Date entryDate;

    private String country;

    private String currency;

    private String email;

    @Column(name = "extra_class_salary")
    private Float extraClassSalary;

    private String hide;

    private String job;

    /**
     * other job working hours per week
     */
    @Column(name = "job_hrs_per_week")
    private Byte jobHrsPerWeek;

    @Column(name = "life_cycle")
    private String lifeCycle;

    private String linkedin;

    private String mobile;

    private String certificates;

    private String introduction;

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
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return bank_account_name
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * @param bankAccountName
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    /**
     * @return bank_address
     */
    public String getBankAddress() {
        return bankAddress;
    }

    /**
     * @param bankAddress
     */
    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    /**
     * @return bank_card_number
     */
    public String getBankCardNumber() {
        return bankCardNumber;
    }

    /**
     * @param bankCardNumber
     */
    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    /**
     * @return bank_name
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return bank_swift_code
     */
    public String getBankSwiftCode() {
        return bankSwiftCode;
    }

    /**
     * @param bankSwiftCode
     */
    public void setBankSwiftCode(String bankSwiftCode) {
        this.bankSwiftCode = bankSwiftCode;
    }

    /**
     * 获取ABA routing number
     *
     * @return bank_aba_routing_number - ABA routing number
     */
    public String getBankAbaRoutingNumber() {
        return bankAbaRoutingNumber;
    }

    /**
     * 设置ABA routing number
     *
     * @param bankAbaRoutingNumber ABA routing number
     */
    public void setBankAbaRoutingNumber(String bankAbaRoutingNumber) {
        this.bankAbaRoutingNumber = bankAbaRoutingNumber;
    }

    /**
     * 获取ACH number
     *
     * @return bank_ach_number - ACH number
     */
    public String getBankAchNumber() {
        return bankAchNumber;
    }

    /**
     * 设置ACH number
     *
     * @param bankAchNumber ACH number
     */
    public void setBankAchNumber(String bankAchNumber) {
        this.bankAchNumber = bankAchNumber;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return contract_end_date
     */
    public Date getContractEndDate() {
        return contractEndDate;
    }

    /**
     * @param contractEndDate
     */
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /**
     * @return contract_start_date
     */
    public Date getContractStartDate() {
        return contractStartDate;
    }

    /**
     * @param contractStartDate
     */
    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    /**
     * @return entry_date
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * @param entryDate
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return extra_class_salary
     */
    public Float getExtraClassSalary() {
        return extraClassSalary;
    }

    /**
     * @param extraClassSalary
     */
    public void setExtraClassSalary(Float extraClassSalary) {
        this.extraClassSalary = extraClassSalary;
    }

    /**
     * @return hide
     */
    public String getHide() {
        return hide;
    }

    /**
     * @param hide
     */
    public void setHide(String hide) {
        this.hide = hide;
    }

    /**
     * @return job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取other job working hours per week
     *
     * @return job_hrs_per_week - other job working hours per week
     */
    public Byte getJobHrsPerWeek() {
        return jobHrsPerWeek;
    }

    /**
     * 设置other job working hours per week
     *
     * @param jobHrsPerWeek other job working hours per week
     */
    public void setJobHrsPerWeek(Byte jobHrsPerWeek) {
        this.jobHrsPerWeek = jobHrsPerWeek;
    }

    /**
     * @return life_cycle
     */
    public String getLifeCycle() {
        return lifeCycle;
    }

    /**
     * @param lifeCycle
     */
    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    /**
     * @return linkedin
     */
    public String getLinkedin() {
        return linkedin;
    }

    /**
     * @param linkedin
     */
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return certificates
     */
    public String getCertificates() {
        return certificates;
    }

    /**
     * @param certificates
     */
    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    /**
     * @return introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * @param introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}