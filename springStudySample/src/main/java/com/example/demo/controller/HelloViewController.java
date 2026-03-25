package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Hello")
public class HelloViewController {

  @GetMapping("View")
  public String helloView() {
    return "Hello";
  }

  @GetMapping("Model")
  public String helloView(Model model) {
    model.addAttribute("msg", "タイムリーフ");
    return "HelloThymeleaf";
  }
}
