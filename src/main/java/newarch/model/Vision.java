package newarch.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.Path;

@Entity
@Table(name = "vision")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vision {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    private String prefix = "C:\\Users\\ajlap\\Desktop";
//    private String fileName = "images with text.png";
    private String token;
//    private String folderName = "b1gcnhmcmm2ufn6m4030";
//    private String folderCookieHeader = "x-folder-id";
//    private Path path = Path.of(prefix, fileName);
    private String endpoint;



}
