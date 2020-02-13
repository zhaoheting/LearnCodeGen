package com.example.LearnCodeGen.helloService.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "附加产品")
public class Ancillary {

    @ApiModelProperty(allowEmptyValue = false)
    private String ancillaryId;
    @ApiModelProperty
    private String ancillaryName;

    public String getAncillaryId() {
        return ancillaryId;
    }

    public void setAncillaryId(String ancillaryId) {
        this.ancillaryId = ancillaryId;
    }

    public String getAncillaryName() {
        return ancillaryName;
    }

    public void setAncillaryName(String ancillaryName) {
        this.ancillaryName = ancillaryName;
    }
}
