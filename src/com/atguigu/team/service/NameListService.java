package com.atguigu.team.service;

import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.*;

import static com.atguigu.team.service.Data.*;

//这个类负责将Data中的数据封装到Employee[]数组中
//同时提供相关操作Employee[]的方法

public class NameListService {
    //声明一个Employee[]类型的数组employees;
    private Employee[] employees;

    //此构造器是为了给employees数组及数组元素初始化；
    public NameListService(){
        /*任务：在构造器中，1、根据项目提供的Data类构建相应大小的employees数组
        * 2、再根据Data类中的数据，构建不同类的对象，包括：Employee、Programmer、Designer、Architect
        * 3、将对象存到数组中
        * */
        employees = new Employee[Data.EMPLOYEES.length];  //初始化数组

        //初始化数组元素（逻辑难）
        for(int i = 0;i < employees.length;i++){
            //ps：1、循环一遍EMPLOYEES数组的内行第一个值，归类对应id和员工类型
            //2、顺便将设备EQUIPMENTS数组也对应给员工：返回一个对象作为数组元素
            // employees[i]对象的一个属性！
            //3、循环后得到初始化的employees数组

            int typename = Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;


            switch(typename){
                case Data.EMPLOYEE:     //调用Data的静态属性EMPLOYEE;
                    //如果是员工，则将EMPLOYEES数组对应的元素赋值到一个
                    //employees数组元素对象中
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case Data.PROGRAMMER:
                    /*额外，要考虑设备，作为一个对象的属性，那么此处的外面跑咯也数组元素对象与
                    * EMPLOYEES数组元素对象不对应，需要重新new
                    * */
                    equipment = new Equipment(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
                    employees[i] = new Programmer(id, name, age, salary,equipment);
                    break;
                case Data.DESIGNER:
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    equipment = new Equipment(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
                    employees[i] = new Designer(id, name, age, salary,equipment,bonus);
                    break;
                case Data.ARCHITECT:
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    equipment = new Equipment(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
                    employees[i] = new Architect(id, name, age, salary,equipment,bonus,stock);
                    break;



            }

        }

    }

    //两个方法
    public Employee[] getAllEmployees(){
        return employees;
    }

    public Employee getEmployee(int id){  //返回某个正常id对应的Emloyee
        return null;
    }

    //createEquipment方法：为了返回一个Equipment对象?，这个对象包含对应的model，display属性
    //更正：需要对应名字的Equipment对象
    /*private Equipment createEquipment(int index){
        //由于是在循环内，且EMPLOYEES数组和EQUIPMENTS数组一一对应；所以直接
        int key = Integer.parseInt(EMPLOYEES[index][3]);



        switch(key){
            case PC:
                return new Equipment(EMPLOYEES[index][1],EMPLOYEES[index][2]);       //由于此处需要返回一个Equipment类型的对象
            case NOTEBOOK:
                return new Equipment(EMPLOYEES[index][1],EMPLOYEES[index][2]);
            case PRINTER:
                return new Equipment(EMPLOYEES[index][1],EMPLOYEES[index][2]);

        }
        */



}
