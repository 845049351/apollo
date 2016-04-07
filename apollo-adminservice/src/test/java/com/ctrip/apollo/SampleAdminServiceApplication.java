package com.ctrip.apollo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SampleAdminServiceApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(SampleAdminServiceApplication.class).run(args);
  }
}