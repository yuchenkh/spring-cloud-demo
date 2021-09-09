package org.example.demo.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// Sep 9, 2021
@Configuration
public class OrderConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
