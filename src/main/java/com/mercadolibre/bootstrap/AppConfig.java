package com.mercadolibre.bootstrap;

import com.mercadolibre.bootstrap.service.SearchService;
import com.mercadolibre.bootstrap.service.Searcheable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Searcheable myService() {
        return new SearchService();
    }
}