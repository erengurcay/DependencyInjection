package com.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Configuration
public class FirstClass {

    public String getName(){
        return "First Class";
    }
    @Bean
    public SecondClass getSecondClass(){
        return new SecondClass();
    }
}
