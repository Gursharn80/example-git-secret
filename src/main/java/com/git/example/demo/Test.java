package com.git.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
  
  
  @Value("${env.hello}")
  private String test;


  @GetMapping(path = "/hello")
  public String getValue(){
         
    return  test;
  }
  

}
