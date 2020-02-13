package com.example.LearnCodeGen.helloService.controller;

import com.example.LearnCodeGen.helloService.controller.api.AncillariesApi;
import com.example.LearnCodeGen.helloService.model.Ancillary;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ancillaries")
public class AncillariesController implements AncillariesApi {

//    @GetMapping("/list")
//    public Object getUserList() {
//        return "get user list.";
//    }
//
//    @PostMapping("/create")
//    public Object createUser() {
//        return "create user.";
//    }

    @Override
    public String getAncillaries(String ancillarieName) {
        return null;
    }

    @Override
    public String addAncillaries(@RequestBody Ancillary ancillary) {
        return null;
    }
}
