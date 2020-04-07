package com.xzh.cloudconfigclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：xzh
 * @date ：Created in 2020-04-07 16:32
 * @description：
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Resource
    private GitConfig gitConfig;

    @GetMapping("/test01")
    public String test01() {
        String result = gitConfig.port + " : " + gitConfig.providerName;
        System.out.println(result);
        return result;
    }
}
