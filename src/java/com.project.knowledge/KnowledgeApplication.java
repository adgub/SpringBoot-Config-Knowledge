package com.project.knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class KnowledgeApplication {
        public static void main(String[] args)
        {
            SpringApplication.run(KnowledgeApplication.class, args);
        }
}
