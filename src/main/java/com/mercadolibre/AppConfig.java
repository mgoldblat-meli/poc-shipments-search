package com.mercadolibre;


import com.mercadolibre.controller.PingController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PingController pingController() {
        return new PingController();
    }
}
