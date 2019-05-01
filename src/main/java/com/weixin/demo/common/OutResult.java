package com.weixin.demo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Created by zfchen on 2019/5/1.
 */
@ApiModel
public class OutResult<T> implements Serializable {

  @ApiModelProperty(value = "数据", example = "")
  private T data;

  @ApiModelProperty(value = "状态码,0表示成功 其他表示失败", example = "0")
  private int status;

  @ApiModelProperty(value = "错误信息", example = "操作成功")
  private String message = "";

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

