package com.zxk.web.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


//@EnableDiscoveryClient
//@EnableFeignClients
@EntityScan("com.xuecheng.framework.domain.ucenter")//扫描实体类
@ComponentScan(basePackages={"com.zxk.web"})//扫描接口
@SpringBootApplication
public class WebSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSecurityApplication.class, args);
    }

}
