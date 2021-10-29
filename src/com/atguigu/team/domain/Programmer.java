package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Programmer extends Employee {
    private int menberId;

    //1、这是一个枚举类的定义属性，在service包中定义一个Status类
    private Status status;
    private Equipment equipment;

    //2、提供一个空参构造器，一个带参构造器
    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    //3、给属性提供get/set方法

    public int getMenberId() {
        return menberId;
    }

    public void setMenberId(int menberId) {
        this.menberId = menberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
