package com.example.demo;

public class Student {



    private int index;
    private int age;
    private String  name;
    private String surname;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int index, int age, String name, String surname) {
        this.index = index;
        this.age = age;
        this.name = name;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Student{" +
                "index=" + index +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
