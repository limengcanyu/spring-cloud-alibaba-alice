package com.nacos.discovery.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Nacos Discovery Consumer Application
 *
 * @author rock
 * @date 2019/5/25
 */
@EnableFeignClients("com.nacos.discovery.consumer.feign.client")
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerApplication.class, args);
    }

}