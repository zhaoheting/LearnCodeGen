package com.example.LearnCodeGen.helloService.controller.api;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(description = "The Test API",
        consumes = "application/json",
        produces = "application/json",
        basePath = "/test",
        tags = "测试tags")
public interface TestApi {

    @ApiOperation(value = "一个测试api", notes = "一个测试api", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "test succeed")
    })
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@ApiParam String testString);
}
