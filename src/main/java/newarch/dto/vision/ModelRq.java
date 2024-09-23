package newarch.dto.vision;

import java.util.List;

public record ModelRq(
         String mimeType,
         List<String> languageCodes,
         String model,
         String content
) {

}
