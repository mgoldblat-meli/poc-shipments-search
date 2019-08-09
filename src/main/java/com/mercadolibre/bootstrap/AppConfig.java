package com.mercadolibre.bootstrap;

import com.mercadolibre.bootstrap.services.SearchService;
import com.mercadolibre.bootstrap.services.SearchServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public SearchService searchService() {
        return new SearchServiceImp();
    }
}