package ua.kucherenko.springmvc_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String greeting(){
        return "hello_world";
    }
}
