package com.nacos.discovery.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    /**
     * 例：http://localhost:8070/echo/sdfsdf
     *
     * @param string
     * @return
     */
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }
}
