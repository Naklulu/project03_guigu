package com.atguigu.team.domain;

public class Designer extends Programmer {
    private double bonus;//奖金

    public Designer() {
    }
    public Designer(int id,String name,int age,double salary,Equipment equipment,double bonus){
        super(id,name,age,salary,equipment);
        this.bonus = bonus;
    }

    public double getBonus(){   //返回值是double类型的
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

}
