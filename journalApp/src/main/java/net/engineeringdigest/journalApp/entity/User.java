package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true) // shbka username unique ho
    @NonNull
    private String userName;
    @NonNull
    private String password;

    @DBRef // ye reference or link bana ne ka kaam kar rhai hai journalEntries ka
    private List<JournalEntry> journalEntries = new ArrayList<>();

}
