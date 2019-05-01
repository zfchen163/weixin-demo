package com.weixin.demo.controller;

import com.weixin.demo.common.OutResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zfchen on 2019/5/1.
 */
@Api(value = "WexinDemoController ", tags = "微信DEMO控制器", description = "微信DEMO控制器")
@RestController
@RequestMapping(value = "/wx")
public class WexinDemoController {

  @ApiOperation(value = "获取粉丝列表", notes = "")
  @GetMapping("/getFans")
  public OutResult getUserList() {

    return new OutResult();
  }
}
