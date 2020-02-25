package com.example.androidmvvmpatern.model;

public class DataModel {

    private String name;

    public DataModel(String name) {
        this.name = "Selamat Datang :\n"+name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
