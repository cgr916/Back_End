package com.atguigu.crowd.mvc.handler;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.entity.Student;
import com.atguigu.crowd.service.api.AdminService;
import com.atguigu.crowd.util.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/5/27 - 11:25
 */
@Controller
public class DemoHandler {
    private Logger logger = LoggerFactory.getLogger(DemoHandler.class);
    @Resource
    private AdminService adminService;

    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap) {
        System.out.println(1/0);
        List<Admin> admiList = adminService.getAll();

        modelMap.addAttribute("adminList",admiList);

        return "target";
    }

    @RequestMapping("send/one/array.html")
    public String ajax01(@RequestParam("array[]") List<Integer> array){

        for(Integer n:array){
            System.out.println(n);
        }

        return null;
    }

    @ResponseBody
    @RequestMapping("send/two/array.html")
    public String ajax02(@RequestBody List<Integer> array){

        for(Integer n:array){
            System.out.println(n);
        }

        return "hello";
    }

    @ResponseBody
    @RequestMapping("send/three/array.html")
    public String ajax03(@RequestBody Student student){

        logger.info(student.toString());

        return "success";
    }

    @ResponseBody
    @RequestMapping("send/four/array.json")
    public AjaxResult<Student> ajax04(@RequestBody Student student){

        logger.info(student.toString());


        return AjaxResult.successWithData(student);
    }


}
