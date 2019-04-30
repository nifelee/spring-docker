package com.example.springdocker.nifelee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @GetMapping("/")
  public LabelValue index() {
    return LabelValue.builder()
        .label("spring")
        .value("docker")
        .build();
  }

}
