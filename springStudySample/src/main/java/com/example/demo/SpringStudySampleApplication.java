package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import com.example.demo.service.Example;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringStudySampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringStudySampleApplication.class, args)
        .getBean(SpringStudySampleApplication.class).execute();
  }

  @Autowired
  private Example example;


  private void execute() {
    example.run();
  }

}
