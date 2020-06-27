package com.github.hcsp.inheritance;

public class Animal {

    private String name;
    private int age;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }


    public void sayMyAge() {
        System.out.println("我的年龄是" + age);

    }
}
