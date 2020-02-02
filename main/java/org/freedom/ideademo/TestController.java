package org.freedom.ideademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello()
    {
        System.out.println("hi");
        return "hello";
    }

}
