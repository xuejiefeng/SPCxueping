package com.personal.spcxueping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "com.personal.spcxueping.mapper")
public class SpCxuepingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpCxuepingApplication.class, args);
    }

}
