package org.example.toby;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name") String name){
        System.out.println("name = " + name);
        if (name.isBlank()){
            throw new IllegalArgumentException();
        }

        return helloService.sayHello(name);
    }
}
