package com.kh.oop.OopEx;

public class People {
    private String name;
    private int jumin;
    private int phone;
    private String hobby;
    private String speciality;

    public People() {
    }

    public People(String name, int jumin, int phone) {
        this.name = name;
        this.jumin = jumin;
        this.phone = phone;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "PeopleRun{" +
                "name='" + name + '\'' +
                ", jumin='" + jumin + '\'' +
                ", phone=" + phone +
                ", hobby='" + hobby + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
