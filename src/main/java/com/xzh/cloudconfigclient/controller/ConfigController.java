package com.xzh.cloudconfigclient.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
@RefreshScope
public class ConfigController {
    @Resource
    private GitConfigData gitConfigData;
    @Resource
    private MyConfigData myConfigData;

    @GetMapping("/test_git_data")
    public ResponseEntity<GitConfigData> testGitData() {
        return ResponseEntity.ok(gitConfigData);
    }

    @GetMapping(value = "/test_config_data", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MyConfigData> testConfigData() {
        return ResponseEntity.ok(myConfigData);
    }
}
