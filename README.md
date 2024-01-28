# search-engine

Demo project for a corporate search engine.

It is based on 2 springboot applications :

- search-engine-receiver : 1 receiver to index documents in repository
- search-engine-api : 1 api to request result

![diagram.svg](resources%2Fdiagram.svg)

## 🧱 Dependencies

- Springboot reactive web (choosen for ability to handle a large set of workload without blocking -> search-engine-receiver)
- Kafka
- ElasticSearch
- Lombok
- Springdoc OpenAPI 3

## 🚀 Local run

### Pre-requisites

- Docker installed (and docker-compose)
- Java 21

```bash
docker-compose up -d # start Elasticsearch & Kafka
```

### Start API

```bash
./gradlew bootRun -p search-engine-api
```

Swagger API documention is provided at : [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### Start Receiver

//TODO

### Test scenario

//TODO 1. index a new document from publishing message in document queue

//TODO 2. search result from API request

