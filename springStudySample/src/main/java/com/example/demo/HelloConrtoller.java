package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloConrtoller {
  private boolean flag = false;

  @RequestMapping("/")
  public ModelAndView index(ModelAndView mav) {
    flag = !flag;
    mav.addObject("flag", flag);
    mav.addObject("msg", "サンプルのメッセージです");
    mav.setViewName("index");
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
