package org.aijiao.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class RibbonConsumerApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new TestRestTemplate();
    }

    public static void main(String[] args) {
       new SpringApplicationBuilder(RibbonConsumerApplication.class).web(true).run(args);
    }

}
