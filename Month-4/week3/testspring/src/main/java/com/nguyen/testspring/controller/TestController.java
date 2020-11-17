package com.nguyen.testspring.controller;

import com.nguyen.testspring.model.Type;
import com.nguyen.testspring.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class TestController {
    @Autowired
    TypeService typeService;
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/create")
    public ModelAndView create(){
        ModelAndView modelAndView=new ModelAndView("create");
        modelAndView.addObject("type",new Type());
        return modelAndView;
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Type type){
        typeService.save(type);
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable int id){
        ModelAndView modelAndView=new ModelAndView("edit");
        Type byId = typeService.findById(id);
        modelAndView.addObject("type", byId);
        return modelAndView;
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Type type){
        typeService.save(type);
        return "redirect:/index";
    }


}
