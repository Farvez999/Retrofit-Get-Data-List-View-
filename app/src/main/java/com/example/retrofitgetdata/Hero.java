package com.example.retrofitgetdata;

public class Hero {
    private String name;
    private String slug;


    public Hero(String name, String slug) {
        this.name = name;
        this.slug = slug;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
