package com.xzh.cloudconfigclient.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：xzh
 * @date ：Created in 2020-04-07 16:29
 * @description：
 * @modified By：
 * @version:
 */
@Component
@Data
public class GitConfigData {

    @Value("${eurekaServer.port}")
    public String port;

    @Value("${feign.client.provide.name}")
    public String providerName;

}
