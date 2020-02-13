package com.example.LearnCodeGen.helloService.controller.api;

import com.example.LearnCodeGen.helloService.model.Ancillary;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(description = "The Ancillaries API",
        consumes = "application/json",
        produces = "application/json",
        basePath = "/ancillaries",
tags = "附加产品管理")
public interface AncillariesApi {

    @ApiOperation(value = "一个附加产品api value", notes = "一个附加产品api notes", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "获取附加产品列表成功"),
            @ApiResponse(code = 404, message = "获取附加产品列表失败")
    })
    @RequestMapping(value = "/getAncillaries", method = RequestMethod.GET)
    public String getAncillaries(@ApiParam String ancillarieName);

    @ApiOperation(value = "一个测试api", notes = "一个测试api")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "添加附加产品成功")
    })
    @RequestMapping(value = "/addAncillaries", method = RequestMethod.POST)
    public String addAncillaries(@ApiParam @RequestBody Ancillary ancillary);
}
