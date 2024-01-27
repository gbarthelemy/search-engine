package org.example.searchengine.domain;

import reactor.core.publisher.Mono;

public interface TestRepository {
    Mono<TestModel> find();
}
