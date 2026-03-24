package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionExample implements Example {
  private SomeService someService;

  public ConstructorInjectionExample(SomeService someService) {
    this.someService = someService;
  }

  @Override
  public void run() {
    someService.doService();
  }
}
