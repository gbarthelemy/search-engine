# search-engine

Demo project for a corporate search engine.

It is based on 2 springboot applications :
- 1 receiver to index documents in repository
- 1 api to request result

## 🧱 Dependencies

- Springboot reactive web (for receiver to be able to consume a large set of messages without blocking) 
- Kafka
- ElasticSearch
- Lombok

## 🚀 Local run

### Pre-requisites

- Docker installed (and docker-compose)
- Java 21

//TODO setup a docker-compose starting Elasticsearch & Kafka

### Start services

//TODO bootRun listener and api

### Test scenario

//TODO index a new document

//TODO search result from API request

