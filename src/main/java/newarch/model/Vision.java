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
    private String token = "t1.9euelZqZjZuekZWXyIqVjZadz5aRku3rnpWayJKYlZDMk5WOycuSjcmVz8nl9PdfOVlI-e9ucWOX3fT3H2hWSPnvbnFjl83n9euelZqbl5GNko6cjsfHj53OmoyRk-_8xeuelZqbl5GNko6cjsfHj53OmoyRkw.nISRbXdYNNHf91Bej2TjiJ23r9uoWuQ8hjKHrC4I_bWckCGJIkGtIHA9pleRMJTds-ciQpj7lHiTrqw7M_tbBg";
//    private String folderName = "b1gcnhmcmm2ufn6m4030";
//    private String folderCookieHeader = "x-folder-id";
//    private Path path = Path.of(prefix, fileName);
    private String endpoint = "https://ocr.api.cloud.yandex.net/ocr/v1/recognizeText";



}
