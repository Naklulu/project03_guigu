package com.atguigu.team.domain;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    /*1、提供一个空参和带参的构造器，快捷键alt+enter
     * 2、提供获得各个属性的get/set()方法
     * */
    //快捷键2：alt +insert
    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
