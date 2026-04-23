package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloConrtoller {


  @RequestMapping("/")
  public ModelAndView index(ModelAndView mav) {
    mav.setViewName("index");
    mav.addObject("msg", "データを表示します");
    String[] data = {"One", "Two", "Three"};
    mav.addObject("data", data);
    return mav;
  }

  @RequestMapping("/other")
  public String other() {
    return "redirect:/";
  }

  @RequestMapping("/home")
  public String home() {
    return "forward:/";
  }



}
