package com.myspace_1.myproject_1;

/**
 * @author yujiaqi
 * @date 2020-07-13 00:04
 * @description
 */
public class Student implements java.io.Serializable{
    private java.lang.Integer id;
    private java.lang.String name;
    private int age;
    private java.lang.String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

