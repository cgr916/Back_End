package com.atguigu.pro3.service;

import com.atguigu.pro3.domain.Employee;
import com.atguigu.pro3.domain.Programmer;

/**
 * @author: cgr
 * @date: 2022/4/10 - 9:52
 */
public class TeamService {
    private int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    TeamService(){
        super();
    }



    public Programmer[] getTeam(){
        return null;
    }

    public void addMember(Employee e){

    }

    public void removeMember(int memberId){

    }

}
