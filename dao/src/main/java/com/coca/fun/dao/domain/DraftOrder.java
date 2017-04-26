package com.coca.fun.dao.domain;

import javax.persistence.*;

@Table(name = "draft_order")
public class DraftOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String category;

    private String address;

    private String price;

    private String sales;

    @Column(name = "evaluation_number")
    private String evaluationNumber;

    private String grade;

    private String deadline;

    private String phone;

    @Column(name = "discount_price")
    private String discountPrice;

    @Column(name = "img_url")
    private String imgUrl;

    private String description;

    @Column(name = "store_description")
    private String storeDescription;

    private String img;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
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
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return sales
     */
    public String getSales() {
        return sales;
    }

    /**
     * @param sales
     */
    public void setSales(String sales) {
        this.sales = sales;
    }

    /**
     * @return evaluation_number
     */
    public String getEvaluationNumber() {
        return evaluationNumber;
    }

    /**
     * @param evaluationNumber
     */
    public void setEvaluationNumber(String evaluationNumber) {
        this.evaluationNumber = evaluationNumber;
    }

    /**
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return deadline
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * @param deadline
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return discount_price
     */
    public String getDiscountPrice() {
        return discountPrice;
    }

    /**
     * @param discountPrice
     */
    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * @return img_url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
     * @return store_description
     */
    public String getStoreDescription() {
        return storeDescription;
    }

    /**
     * @param storeDescription
     */
    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }
}