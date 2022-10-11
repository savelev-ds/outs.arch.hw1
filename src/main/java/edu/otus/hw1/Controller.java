package edu.otus.hw1;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    private static final Map<String, String> RESPONSE = Collections.singletonMap("status", "OK");

    @GetMapping("/health")
    public Map<String, String> health() {
        return RESPONSE;
    }

}
