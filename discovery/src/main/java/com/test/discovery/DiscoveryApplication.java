package com.test.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

    // 程序的入口，启动加载配置，初始化容器
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }

}
