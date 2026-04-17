package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloConrtoller {
  @RequestMapping("/{num}")
  public String index(@PathVariable int num, Model model) {
    int res = 0;
    for (int i = 1; i <= num; i++) {
      res += i;
    }
    model.addAttribute("msg", "totao:" + res);
    return "index";
  }


}
