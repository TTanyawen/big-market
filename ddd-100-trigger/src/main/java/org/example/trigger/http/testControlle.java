package org.example.trigger.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.groups.ConvertGroup;

@Controller
public class testControlle {
    @RequestMapping("/hello")
    String hello(){
        return "hello";
    }
}
