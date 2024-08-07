package org.example.config.autoConfig;

import org.example.config.MyAutoConfiguration;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@MyAutoConfiguration
public class JettyWebServerConfig {

    @Bean("jettyWebServerFactory")
    public ServletWebServerFactory servletWebServerFactory(){
        return new JettyServletWebServerFactory();
    }
}
