package com.example.hw2car;


import java.io.Serializable;

public class Car implements Serializable {
    private int Image;
    private String Name;
    private String Email;

    public int getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public Car(int image, String name, String email)
    {
        this.Image = image;
        this.Name = name;
        this.Email = email;
    }

}
