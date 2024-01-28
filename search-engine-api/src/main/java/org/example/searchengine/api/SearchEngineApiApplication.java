package org.example.searchengine.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "org.example.searchengine.api",
        "org.example.searchengine.domain",
        "org.example.searchengine.repository"
})
public class SearchEngineApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchEngineApiApplication.class, args);
    }
}
