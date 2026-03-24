package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import com.example.demo.service.BusinessLogic;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringStudySampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringStudySampleApplication.class, args)
        .getBean(SpringStudySampleApplication.class).execute();
  }

  @Autowired
  @Qualifier("test")
  private BusinessLogic business1;

  @Autowired
  @Qualifier("sample")
  private BusinessLogic business2;

  private void execute() {
    business1.doLogic();
    business2.doLogic();
  }

}
