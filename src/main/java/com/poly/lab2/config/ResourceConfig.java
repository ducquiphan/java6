package com.poly.lab2.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ResourceConfig {
    @Bean("messageSource")
    public MessageSource getMessageSource(){
        ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
        ms.setDefaultEncoding("utf-8");
        ms.setBasenames("classpath:lab2/menu");
        return ms;
    }
}
