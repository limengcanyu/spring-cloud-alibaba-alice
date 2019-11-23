package com.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * The @SentinelResource annotation is used to identify if a resource is rate limited or degraded.
     * In the sample, the 'hello' attribute of the annotation refers to the resource name.
     *
     * @SentinelResource also provides attributes such as blockHandler, blockHandlerClass, and fallback to identify rate limiting or degradation operations.
     * For more details, refer to Sentinel Annotation Support.
     *
     * localhost:8073/hello
     *
     * @return
     */
    @SentinelResource("hello")
    @GetMapping(value = "/hello")
    public String hello() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello Sentinel";
    }

}
