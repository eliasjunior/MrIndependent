package com.example.adapter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.domain.usecase.MenuUseCase;

@Configuration
public class AppConfig {
    
    @Bean
    public MenuUseCase createUseCase() {
        return null;
       // return new CreateMenuUseCase(new InMenuRepository());
    }
}
