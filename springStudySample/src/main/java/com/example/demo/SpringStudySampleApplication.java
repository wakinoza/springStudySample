package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import com.example.demo.used.Greet;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringStudySampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringStudySampleApplication.class, args)
        .getBean(SpringStudySampleApplication.class).execute();
  }

  @Autowired
  private Greet g;

  private void execute() {
    String msg = g.greeting();
    System.out.println(msg);
  }

}
