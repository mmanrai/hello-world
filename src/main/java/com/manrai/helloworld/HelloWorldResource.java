package com.manrai.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mohit on 12/05/18.
 */
@RestController
public class HelloWorldResource {

    @GetMapping
    public String hello() {
        return "hello world";
    }
}
