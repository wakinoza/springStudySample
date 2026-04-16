package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloConrtoller {
  @RequestMapping("/{temp}")
  public String index(@PathVariable String temp) {
    return switch (temp) {
      case "index" -> "index";
      default -> "other";
    };
  }


}
