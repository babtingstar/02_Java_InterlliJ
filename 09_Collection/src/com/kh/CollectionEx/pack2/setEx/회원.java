package com.kh.CollectionEx.pack2.setEx;

import java.util.Objects;

public class 회원 {
    private int id;
    private String name;
    private String email;
    private String hobby;

    public 회원() {
    }

    public 회원(int id, String name, String email, String hobby) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "회원{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof 회원 회원)) return false;
        return id == 회원.id && Objects.equals(name, 회원.name) && Objects.equals(email, 회원.email) && Objects.equals(hobby, 회원.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, hobby);
    }
}
