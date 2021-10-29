package com.atguigu.team.com.atguigu.team.junit;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import org.junit.Test;

import java.sql.SQLOutput;

public class NameListServiceTest {
    @Test
    public void testgetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0;i < employees.length;i++){
            System.out.println(employees[i]);

        }
        System.out.println("test 一下 github操作,four commit in master,six commit in master");

    }


}
