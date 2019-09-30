package com.mercury.microservices.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author stanley
 * @create 2019/9/30 23:04
 */

@RestController
public class DemoController {

    @RequestMapping(value = "/available")
    public String available() {
        return "Spring in action";
    }

}
