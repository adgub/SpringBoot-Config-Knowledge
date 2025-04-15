package com.project.knowledge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = "com.project.knowledge.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class KnowledgeApplication {
        public static void main(String[] args)
        {
            SpringApplication.run(KnowledgeApplication.class, args);
        }
}
