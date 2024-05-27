package com.cyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args)  {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);
        System.out.println("启动完成");
    }

}
