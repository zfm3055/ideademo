package com.nljt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class HelloController {

    @RequestMapping("/info")
    public String info(){
        return "hello zfm aa，老王头111123";
    }
}
