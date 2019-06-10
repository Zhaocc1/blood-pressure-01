package com.trtjk.bloodpressure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(value = {"com.trtjk.bloodpressure.mapper"})
public class BloodPressureApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloodPressureApplication.class, args);
    }

}
