package newarch.controller;

import lombok.AllArgsConstructor;
import newarch.model.News;

import newarch.repo.NewsRepository;
import newarch.service.NewsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class NewsController {

    private final NewsService newsService;


//    @GetMapping(value = "/news")
//    public List<News> getAllNews() {
//        return newsService.getAllNews();
//    }
    @GetMapping(value = "/news")
    public String getAllNews() {

        return newsService.getAllNews().toString();

    }
}
