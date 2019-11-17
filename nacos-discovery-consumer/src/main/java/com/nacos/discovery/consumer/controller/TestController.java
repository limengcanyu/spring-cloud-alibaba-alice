package com.nacos.discovery.consumer.controller;

import com.nacos.discovery.consumer.feign.client.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    private EchoService echoService;

    /**
     * 使用 RestTemplate
     *
     * http://127.0.0.1:8071/echo-rest/1234
     *
     * @param str
     * @return
     */
    @GetMapping(value = "/echo-rest/{str}")
    public String rest(@PathVariable String str) {
        return restTemplate.getForObject("http://nacos-discovery-provider/echo/" + str, String.class);
    }

    /**
     * 使用 FeignClient
     *
     * http://127.0.0.1:8071/echo-feign/12345
     *
     * @param str
     * @return
     */
    @GetMapping(value = "/echo-feign/{str}")
    public String feign(@PathVariable String str) {
        return echoService.echo(str);
    }
}
