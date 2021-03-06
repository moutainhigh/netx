package com.netx.shopping.vo;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

public class GetMerchantRequestDto {

    @ApiModelProperty("商家id")
    @NotBlank(message = "商家id不能为空")
    private String id;

    @ApiModelProperty("用户id")
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
