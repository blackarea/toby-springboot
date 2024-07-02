package org.example.config.autoConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletConfig {

    @Bean
    public DispatcherServlet dispatcherServlet(){
        return new DispatcherServlet();
    }
}