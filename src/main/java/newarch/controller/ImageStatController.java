package newarch.controller;

import lombok.AllArgsConstructor;
import newarch.dto.vision.VisionDTO;
import newarch.model.ImageStat;
import newarch.model.Vision;
import newarch.service.ImageStatService;
import newarch.service.VisionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:8081")
public class ImageStatController {

    private final ImageStatService imageStatService;
    private final VisionService visionService;

    @GetMapping("/")
    public String makeImageStat(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("makeImageStat", imageStatService.imageStatList(title));
        return "home";
    }
    @GetMapping("/image_stat/{id}")
    public String imageStatInfo(@PathVariable(value = "id") Long id, Model model) {
        ImageStat imageStat = imageStatService.getImageStatById(id);
        model.addAttribute("image_stat", imageStat);
        model.addAttribute("images", imageStat.getImages());
        return "info";
    }
    @PostMapping("/image_stat/create")
    public String createImageStat(@RequestParam("file1") MultipartFile file1, ImageStat imageStat) throws IOException {
        imageStatService.saveImageStat(imageStat, file1);
        //return "redirect:/";
        return "info";
    }


    @PostMapping("/image_stat/delete/{id}")
    public String deleteImageStat(@PathVariable(value = "id") Long id) {
        imageStatService.deleteImageStat(id);
        return "redirect:/";
    }

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }
    @GetMapping("/info")
    public String getInfo() {
        return "info";
    }
    @GetMapping("/text")
    public String getText() {
        return "text";
    }
    @GetMapping("/home02")
    public String getHome02() {
        return "home02";
    }
}