package org.example.searchengine.repository;

import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ReactiveElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

@Configuration
@RequiredArgsConstructor
@EnableReactiveElasticsearchRepositories(basePackages = "org.example.searchengine.repository")
public class ClientConfig extends ReactiveElasticsearchConfiguration {

    @Value("${elasticsearch.cluster-node}")
    private String[] hostAndPorts;

    @Override
    @Nonnull
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration
                .builder()
                .connectedTo(hostAndPorts)
                .build();
    }
}
