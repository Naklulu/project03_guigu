package com.atguigu.team.service;

/*表示员工的状态
1、直接造三个对象FREE,BUSY,VOCATION,这三个对象可以直接通过类去调用
这是个枚举类；
* */
public class Status {
    //3、定义一个属性，表示三个对象不同
    private final String NAME;


    //2、由于是枚举类，不想让外部在new对象，所以要私有化构造器
    private Status(String name){
        this.NAME = name;
    }

    /*1、这在类内造了三个对象，如果不提供get方法去获取类内的这几个对象
    * 那么也可以定义对象成public也行
    * 2、如果只是造一个对象，那么就是单例了，而造三个那就是枚举类；
    * */
    public static final Status FREE = new Status("FREE");//复制ctrl+d
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");


}
