package org.example.searchengine.api.controller;

import lombok.RequiredArgsConstructor;
import org.example.searchengine.domain.TestModel;
import org.example.searchengine.domain.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public Mono<TestModel> get() {
        return testService.find();
    }
}
