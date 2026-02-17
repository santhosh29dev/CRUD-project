package com.Legionofcoders.CRUD_project_demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RestController;

@Document(collection = "Reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {

    private ObjectId id;
    private String body;

    public Reviews(String body) {
        this.body = body;
    }
}
