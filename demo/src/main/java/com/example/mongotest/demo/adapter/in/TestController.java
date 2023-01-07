package com.example.mongotest.demo.adapter.in;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    private final Logger log = LogManager.getLogger(TestController.class);

    @PostMapping
    public String execute() {
        log.info("Has a bug on the Enter button");
        return "Look at this beatufil workaround JJ\n";
    }
}