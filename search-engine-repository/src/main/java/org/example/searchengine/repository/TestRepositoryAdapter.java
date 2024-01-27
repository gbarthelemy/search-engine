package org.example.searchengine.repository;

import org.example.searchengine.domain.TestModel;
import org.example.searchengine.domain.TestRepository;
import reactor.core.publisher.Mono;

public class TestRepositoryAdapter implements TestRepository {


    @Override
    public Mono<TestModel> find() {
        //TODO implement ElasticSearch repo
        return Mono.just(new TestModel("1", 1));
    }
}
