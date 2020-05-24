package com.cxb.springcloud.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {

    @GetMapping("/balance")
    public String balance(@RequestParam("id")int id){
        return "获取的价格：" + id;
    }
}
