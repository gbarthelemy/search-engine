package org.example.searchengine.repository;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.searchengine.domain.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@org.springframework.data.elasticsearch.annotations.Document(indexName = "document")
public class DocumentEntity {
    @Id
    private UUID id;

    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Text, name = "type")
    private String type;

    @Field(type = FieldType.Text, name = "description")
    private String description;

    @Field(type = FieldType.Text, name = "url")
    private String url;

    @Field(type = FieldType.Keyword, name = "tags")
    private List<String> tags;

    @Field(type = FieldType.Date, format = DateFormat.basic_date_time_no_millis, name = "creation_date")
    private LocalDateTime creationDate;


    public Document toDomain() {
        return new Document(id, name, type, description, url, tags, creationDate);
    }

    public static DocumentEntity fromDomain(Document document) {
        return new DocumentEntity(
                document.id(),
                document.name(),
                document.type(),
                document.description(),
                document.url(),
                document.tags(),
                document.creationDate()
        );
    }
}
