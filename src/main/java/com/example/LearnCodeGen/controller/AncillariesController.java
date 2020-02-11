package com.example.LearnCodeGen.controller;

import com.example.LearnCodeGen.controller.api.AncillariesApi;
import com.example.LearnCodeGen.model.Ancillary;
import io.swagger.annotations.ApiParam;
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
