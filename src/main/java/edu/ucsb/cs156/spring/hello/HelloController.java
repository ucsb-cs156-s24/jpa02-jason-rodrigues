package edu.ucsb.cs156.spring.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        // email is jason_rodrigues; converted _ to -
        return "Greetings from jason-rodrigues!";
    }
    
}
