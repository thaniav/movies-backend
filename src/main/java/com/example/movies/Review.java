package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
   
    private ObjectId id;
    private String body;
    public Review(String reviewBody) {
        this.body=reviewBody;
    }
    @Override
    public String toString() {
        return "Review [id=" + id + ", body=" + body + "]";
    }
    
}
