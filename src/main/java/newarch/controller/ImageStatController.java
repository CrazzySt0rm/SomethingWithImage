package newarch.controller;

import lombok.AllArgsConstructor;
import newarch.dto.vision.VisionDTO;
import newarch.model.ImageStat;
import newarch.model.Vision;
import newarch.model.random.panel.HelloActionListener;
import newarch.model.random.panel.Learn;
import newarch.service.ImageStatService;
import newarch.service.PanelService;
import newarch.service.VisionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:8081")
public class ImageStatController extends Learn {

    private final ImageStatService imageStatService;
    private final VisionService visionService;
    private final PanelService panelService;


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


    @DeleteMapping("/image_stat/delete/{id}")
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
    public String getTextxz() {
        return "text";
    }
    @GetMapping("/home02")
    public String getHome02() {
        return "home02";
    }
    @GetMapping("/noGameNoLife")
    public String getNoGameNoLife() {
        return "noGameNolife";
    }
    @GetMapping("/home06")
    public String getHomeSixth() {
        return "home06";
    }
    @GetMapping("/home07")
    public String getHomeSeven() {
        return "home07";
    }
    @GetMapping("/home08")
    public String getHomeEight() {
        return "home08";
    }
    @GetMapping("/home09")
    public String getHomeNibe() {
        return "home09";
    }
    @GetMapping("/home_test")
    public String getHomeTest() {
        return "home_test";
    }


    @GetMapping("/panel")
    public void getLearn(@RequestBody Learn learn) {
        learn.learn();


//        return "home";
    }
}
