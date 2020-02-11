package com.example.LearnCodeGen.controller;

import com.example.LearnCodeGen.controller.api.TestApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestSwaggerController implements TestApi {

    @Override
    public String test(String testString) {
        return null;
    }
}
