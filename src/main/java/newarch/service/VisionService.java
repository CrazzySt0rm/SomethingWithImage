package newarch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import newarch.dto.vision.ModelRq;
import newarch.dto.vision.VisionDTO;
import newarch.model.Image;
import newarch.model.ImageStat;
import newarch.model.Vision;
import newarch.repo.ImageStatRepository;
import newarch.repo.VisionRepository;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.utils.Base64;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor



//@AllArgsConstructor
public class VisionService {

    private final VisionRepository visionRepository;
    private final ImageStatRepository imageStatRepository;

    public void VisionService() {

    String prefix = "C:\\Users\\ajlap\\Desktop";
    String fileName = "images with text.png";
    String token = "t1.9euelZqZjZuekZWXyIqVjZadz5aRku3rnpWayJKYlZDMk5WOycuSjcmVz8nl9PdfOVlI-e9ucWOX3fT3H2hWSPnvbnFjl83n9euelZqbl5GNko6cjsfHj53OmoyRk-_8xeuelZqbl5GNko6cjsfHj53OmoyRkw.nISRbXdYNNHf91Bej2TjiJ23r9uoWuQ8hjKHrC4I_bWckCGJIkGtIHA9pleRMJTds-ciQpj7lHiTrqw7M_tbBg";
    String folderName = "b1gcnhmcmm2ufn6m4030";
    String folderCookieHeader = "x-folder-id";
    Path path = Path.of(prefix, fileName);
    String endpoint = "https://ocr.api.cloud.yandex.net/ocr/v1/recognizeText";




        // Получите содержимое файла в формате Base64.
        byte[] fileData = null;
        try {
            fileData = Base64.encodeBase64(Files.readAllBytes(path));
            System.out.println("File data len: " + fileData.length);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        String data = new String(fileData, StandardCharsets.UTF_8);
        System.out.println("data write to file :" + data);

        ObjectMapper mapper = new ObjectMapper();
        String body = null;
        try {
            body = mapper.writeValueAsString(new ModelRq(
                    "PNG",
                    List.of("*"),
                    "page",
                    data
            ));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

            ClassicHttpRequest httpPost = ClassicRequestBuilder.post(endpoint)
                    .setEntity(body)
                    .setHeader("Content-Type", "application/json")
                    .setHeader(folderCookieHeader, folderName)
                    .setHeader("x-data-logging-enabled", "true")
                    .setHeader("Authorization:", "Bearer " + token)
                    .build();


            httpclient.execute(httpPost, response -> {
                System.out.println(response.getCode() + " " + response.getReasonPhrase());
                final HttpEntity entity2 = response.getEntity();

                var str = entity2.getContent().readAllBytes();
                System.out.println(new String(str));


//                ModelResponse mr = mapper.readValue(str, ModelResponse.class);
////                System.out.println("content " + mr);
//                var texts = mr.result().textAnnotation().blocks().stream().flatMap(b ->
//                        b.lines().stream().map(Line::text));
//                System.out.println("texts");
//                texts.forEach(System.out::println);


                EntityUtils.consume(entity2);
                return null;
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Vision saveToken(VisionDTO visionDTO) {
        return visionRepository.save(Vision.builder()
                .token(visionDTO.getToken())
                .endpoint(visionDTO.getEndpoint())
                .build());
    }

    public List<Vision> readVision() {
        return visionRepository.findAll();
    }

    public Vision updateVision(Vision vision) {
        return visionRepository.save(vision);
    }

    public void deleteVision(Long id) {
        visionRepository.deleteById(id);
    }

}
