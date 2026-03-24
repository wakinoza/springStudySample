package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

// @Component
public class SetterInjectionExample implements Example {
  private SomeService someService;

  @Autowired
  public void setSomeService(SomeService someService) {
    this.someService = someService;
  }

  @Override
  public void run() {
    someService.doService();
  }
}
