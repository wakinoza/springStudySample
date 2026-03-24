package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean(name = "test")
  public BusinessLogic dataLogic() {
    return new TestLogicImpl();
  }

  @Bean(name = "sample")
  public BusinessLogic viewLogic() {
    return new SampleLogicImpl();
  }
}
