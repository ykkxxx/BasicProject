package com.yupi.yupicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yupi.yupicturebackend.mapper")
public class YiPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiPictureBackendApplication.class, args);
    }

}
