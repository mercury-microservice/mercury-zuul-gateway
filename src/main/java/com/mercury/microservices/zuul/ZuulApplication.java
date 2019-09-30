package com.mercury.microservices.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author stanley
 * @create 2019/9/30 22:54
 */

@SpringBootApplication
@EnableZuulProxy
@ComponentScan(value = "com.mercury.microservices.zuul.filter")
public class ZuulApplication {

    public static void main(String args[]) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
