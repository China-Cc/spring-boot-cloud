package com.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer  // 启用配置管理功能
@EnableDiscoveryClient // 表明这个是一个发现服务的客户端程序
public class ConfigApplication{
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
