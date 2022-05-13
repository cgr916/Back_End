package com.atguigu.pro3.service;

import com.atguigu.pro3.domain.*;

import static com.atguigu.pro3.service.Data.*;

/**
 * @Description: 负责将Data的数据封装到 Employee[] 数组中，同时提供操作 Employee[] 的方法;
 * @author: cgr
 * @date: 2022/4/9 - 10:46
 */
public class NameListService {
    private Employee[] employees;

    // 构造器
    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0;i < EMPLOYEES.length;i++){
            Equipment equipment;
            Double bonus;
            int stock;
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            switch (type){
                case EMPLOYEE:
                        employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                        equipment = createEquipment(i);
                        employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                        equipment = createEquipment(i);
                        bonus = Double.parseDouble(EQIPMENTS[i][5]);
                        employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                        equipment = createEquipment(i);
                        bonus = Double.parseDouble(EQIPMENTS[i][5]);
                        stock = Integer.parseInt(EQIPMENTS[i][6]);
                        employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    // 获取指定位置的员工设备
    private Equipment createEquipment(int index) {
        int eType = Integer.parseInt(EQIPMENTS[index][0]);
        String modelName = EQIPMENTS[index][1];
        switch (eType){
            case PC:
                String display = EQIPMENTS[index][2];
                return new PC(modelName,display);
            case NOTEBOOK:
                double price = Double.parseDouble(EQIPMENTS[index][2]);
                return new NoteBook(modelName,price);
            case PRINTER:
                String type = EQIPMENTS[index][2];
                return  new Printer(modelName,type);
        }
    return null;
    }

    public Employee[] getAllEmployees(){
        return null;
    }

    public Employee getEmployees(int id) throws TeamException{
        for (int i = 0;i < employees.length;i++){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("未找到指定员工");
    }
}
