package com.lexelpro.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 傅華暘 on 2016/9/30.
 */
@Entity
@Table(name = "javabean")
public class javabean implements Serializable {

    private static final long serialVersionUID = -7988799579036225137L;

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String commodityClass;
    @Column
    private float price;
    @Column
    private String info;
    @Column
    private String Material;
    @Column
    private String laundryGuide;
    @Column
    private String type;
    @Column
    private int num;
    @Column
    private String phto;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCommodityClass() {
        return commodityClass;
    }
    public void setCommodityClass(String commodityClass) {
        this.commodityClass = commodityClass;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public String getMaterial() {
        return Material;
    }
    public void setMaterial(String material) {
        Material = material;
    }
    public String getLaundryGuide() {
        return laundryGuide;
    }
    public void setLaundryGuide(String laundryGuide) {
        this.laundryGuide = laundryGuide;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getPhto() {
        return phto;
    }
    public void setPhto(String phto) {
        this.phto = phto;
    }

}
