package org.example.searchengine.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository repository;

    public Mono<TestModel> find() {
        return repository.find();
    }
}
