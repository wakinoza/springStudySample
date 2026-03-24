package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

// @Component
public class FieldInjectionExample implements Example {
  @Autowired
  private SomeService someService;

  @Override
  public void run() {
    someService.doService();
  }
}
