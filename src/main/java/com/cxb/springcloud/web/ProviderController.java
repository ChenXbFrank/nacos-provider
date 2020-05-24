package com.cxb.springcloud.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//实现配置的热加载
@RefreshScope
public class ProviderController {

    Logger logger = LoggerFactory.getLogger(ProviderController.class);

    @Value("${username:frank}")
    private String username;

    @Value("${address:china}")
    private String address;

    @RequestMapping("/getInfo")
    public String getInfo() {
        return address + ":"+ username;
    }

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name",defaultValue = "frank",required = false)String name){
        logger.info("name:{}", name);
        return "hi "+name;
    }
}

