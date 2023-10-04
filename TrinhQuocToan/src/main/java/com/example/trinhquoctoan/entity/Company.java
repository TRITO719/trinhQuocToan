package com.example.trinhquoctoan.entity;

public class Company {
    private long id;
    private String about;
    private String email;
    private String name;
    private String phone;
    private String webURL;

    public Company(long id, String about, String email, String name, String phone, String webURL) {
        this.id = id;
        this.about = about;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.webURL = webURL;
    }

    public Company() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", about='" + about + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", webURL='" + webURL + '\'' +
                '}';
    }
}
