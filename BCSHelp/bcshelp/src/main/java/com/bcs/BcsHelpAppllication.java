package com.bcs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: BcsHelp
 * 日期: 2019/10/18 13:15
 *
 * @author Air张
 * @since JDK 1.8
 */
@SpringBootApplication
@MapperScan("com.bcs.mapper")
public class BcsHelpAppllication {
    public static void main(String[] args) {
        SpringApplication.run(BcsHelpAppllication.class, args);
    }
}
