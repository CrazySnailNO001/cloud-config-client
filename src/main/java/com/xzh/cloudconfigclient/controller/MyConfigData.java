package com.xzh.cloudconfigclient.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：xzh
 * @date ：Created in 2020-04-11 13:35
 * @description：
 * @modified By：
 * @version:
 */
@Component
@ConfigurationProperties(prefix = "feign.client.provide") //,ignoreInvalidFields = true 忽略属性不匹配
@Data
public class MyConfigData {

    private String name;
    private String path;

}
