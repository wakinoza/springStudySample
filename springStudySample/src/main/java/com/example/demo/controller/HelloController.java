package com.example.demo.controller;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.entities.Person;
import com.example.demo.repositories.PersonRepository;


@Controller
public class HelloController {


  @Autowired
  PersonRepository repository;

  @RequestMapping("/")
  public ModelAndView index(@ModelAttribute("formModel") Person person, ModelAndView mav) {
    mav.setViewName("index");
    mav.addObject("title", "Hello page");
    mav.addObject("msg", "this is JPA sample data.");
    List<Person> list = repository.findAll();
    mav.addObject("data", list);
    return mav;
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  @Transactional
  public ModelAndView form(@ModelAttribute("formModel") Person person, ModelAndView mav) {
    repository.saveAndFlush(person);

    return new ModelAndView("redirect:/");
  }

  @PostConstruct
  public void init() {
    Person p1 = new Person();
    p1.setName("taro");
    p1.setAge(39);
    p1.setMail("taro@yamada");
    repository.saveAndFlush(p1);

    Person p2 = new Person();
    p2.setName("jiro");
    p2.setAge(35);
    p2.setMail("jiro@yamada");
    repository.saveAndFlush(p2);

    Person p3 = new Person();
    p3.setName("hanako");
    p3.setAge(33);
    p3.setMail("hanako@yamada");
    repository.saveAndFlush(p3);
  }

  @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
  public ModelAndView edit(@ModelAttribute Person person, @PathVariable int id, ModelAndView mav) {
    mav.setViewName("edit");
    mav.addObject("title", "edit person");
    Optional<Person> data = repository.findById((long) id);
    mav.addObject("formModel", data.get());
    return mav;
  }

  @RequestMapping(value = "/edit", method = RequestMethod.POST)
  @Transactional
  public ModelAndView update(@ModelAttribute Person person, ModelAndView mav) {
    repository.saveAndFlush(person);
    return new ModelAndView("redirect:/");
  }


}
