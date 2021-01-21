package com.nov.springbootpoi.provider.poi;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: november
 * Date: 2021/1/21 4:12 下午
 */
public class Teacher {
    private String number;
    private String name;
    private String idCard;
    private String password;

    public Teacher(String number, String name, String idCard, String password) {
        this.number = number;
        this.name = name;
        this.idCard = idCard;
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
