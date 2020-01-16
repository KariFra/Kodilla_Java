package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board(){
        return new Board(tasklist(),tasklist(),tasklist());
    }

    @Bean
    public TaskList tasklist(){
        return new TaskList();
    }
}
