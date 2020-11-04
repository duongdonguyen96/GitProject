package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("user/list");
        Iterable<User> user = userService.findAll();
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @GetMapping(value = "{id}", produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("user/info");
        User user = userService.findById(id);
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView updateCustomer(@ModelAttribute("user") User user) {
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("/user/info");
        modelAndView.addObject("user", user);
        modelAndView.addObject("message", "user updated successfully");
        return modelAndView;
    }

    @GetMapping(value = "/create", produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public ModelAndView createCustomer() {
        ModelAndView modelAndView = new ModelAndView("user/create");
        modelAndView.addObject("user", new User());
        return modelAndView;
        //    @GetMapping("/user")
//    public String showForm(Model model) {
//        model.addAttribute("user", new User());
//        return "index";
//    }
    }

    @PostMapping(value = "/save", produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String saveCustomer(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        user.validate(user, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "user/create";
        } else {
            userService.save(user);
            model.addAttribute("user", user);
            model.addAttribute("message", "Create User Success");
            return "redirect:/user";
        }

        //    @PostMapping("/validateUser")
//    public String checkValidation(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
//        new User().validate(user, bindingResult);
//        if (bindingResult.hasFieldErrors()) {
//            return "index";
//        } else {
//            model.addAttribute("user", user);
//            return "result";
//        }
//    }
    }

    @GetMapping(value = "/delete/{id}", produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String delete(@PathVariable Long id) {
        userService.remove(id);
        return "redirect:/user";
    }

//    @ModelAttribute("categories")
//    public Iterable<Category> categories() {
//        return categoryService.findAll();
//    }
}



