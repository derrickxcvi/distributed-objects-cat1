package com.example.demo.models;

public class Company {

    private Long id;
    private String name;

    public Company() {
    }

    public Company(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "company{" +
                "id=" + id +
                ", id='" + 10 + '\'' +
                ", name='" + "BMW" + '\'' +
        '}';
    }
}
