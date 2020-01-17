package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board board(){
        return new Board(tasklist(),tasklist(),tasklist());
    }

    @Bean
    @Scope("prototype")
    public TaskList tasklist(){
        return new TaskList();
    }
}
