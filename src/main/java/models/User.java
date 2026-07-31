package models;

import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Data
public class User {

    @BsonId
    private String id;
    private String nome;
    private String email;
    private Integer idade;
}
