package com.nacos.discovery.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Nacos Discovery Provider Application
 *
 * @author rock
 * @date 2019/5/25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryProviderApplication.class, args);
    }

}
