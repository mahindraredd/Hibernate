package com.uni.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String show(Map<String, Object> model) {
        String msg = "hello mahi";
        System.out.println(model.getClass().getName());
        model.put("msg", msg);
        return "home";
    }

    @GetMapping("/report")
    public String showReport(Map<String, Object> model) {
        System.out.println(model.getClass().getName() + "2");
        model.put("name", "Mahindra");
        model.put("age", 24);
        model.put("address", "Andhra Pradesh");
        String[] countryNames=new String[] {"india","Canada","london"};
        model.put("countryNames", countryNames);
        
        
        return "display";
    }
}
