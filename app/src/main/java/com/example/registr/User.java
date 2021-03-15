package com.example.registr;

public class User {
    private String name;
    private String lastName;
    private String sex;
    private String placeOfStudy;
    private String date ;
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPlaceOfStudy(String placeOfStudy) {
        this.placeOfStudy = placeOfStudy;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String getPlaceOfStudy() {
        return placeOfStudy;
    }

    public String getDate() {
        return date;
    }
}
