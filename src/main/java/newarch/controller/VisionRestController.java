package newarch.controller;

import lombok.AllArgsConstructor;
import newarch.dto.vision.VisionDTO;
import newarch.model.Vision;
import newarch.repo.VisionRepository;
import newarch.service.VisionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:8081")
public class VisionRestController {

    private final VisionService visionService;

    @PostMapping("/vision")
    public ResponseEntity createTokenAndEndpoint(@RequestBody VisionDTO visionDTO) {
        return new ResponseEntity<>(visionService.saveToken(visionDTO), HttpStatus.OK);
    }

    @GetMapping("/vision")
    public ResponseEntity readV() {
        return new ResponseEntity<>(visionService.readVision(), HttpStatus.OK);
    }

    @PutMapping("/vision")
    public ResponseEntity updateVis(@RequestBody Vision vision) {
        return new ResponseEntity<>(visionService.updateVision(vision), HttpStatus.OK);
    }

    @DeleteMapping("/vision/{id}")
    public HttpStatus deleteVis(@PathVariable(value = "id") Long id) {
        visionService.deleteVision(id);
        return HttpStatus.OK;
    }
}
