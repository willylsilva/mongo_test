package com.example.mongotest.demo.adapter.in;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @PostMapping
    public String execute() {
        return "Look at this beatufil workaround JJ\n";
    }
}