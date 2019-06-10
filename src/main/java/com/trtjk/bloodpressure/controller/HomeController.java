package com.trtjk.bloodpressure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/index")
    public  String index(){

        return  "32432322332";
    }
}
