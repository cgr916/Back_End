package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: cgr
 * @date: 2022/5/21 - 21:50
 */
@Controller
public class ReqController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/req")
    public String req(){
        return "req";
    }

//    @RequestMapping("/modelAndView")
//    public String mv(){
//        return "m_v";
//    }

    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("modelAndView","hello m_v");
        mv.setViewName("m_v");
        return mv;
    }

    @RequestMapping("/model")
    public String model(Model m){
        m.addAttribute("modelAndView","hello model");
        return "m_v";
    }
}
