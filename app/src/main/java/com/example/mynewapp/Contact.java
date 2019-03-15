package com.example.mynewapp;

public class Contact {

    private String name;
    private String lastname;
    private String phone;
    private int Kind;

    public Contact(String name, String lastname, String phone, int kind) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        Kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getKind() {
        return Kind;
    }

    public void setKind(int kind) {
        Kind = kind;
    }
}
