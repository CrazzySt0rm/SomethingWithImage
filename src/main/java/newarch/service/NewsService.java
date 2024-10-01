package newarch.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import newarch.model.News;
import newarch.repo.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;

    public void save(News news) {
        newsRepository.save(news);
    }

    public boolean isExist(String newsTitle) {
        List<News> newsList = newsRepository.findAll();
        for (News news1 : newsList) {
            if (news1.getTitle().equals(newsTitle)) {
                return true;
            }
        }
        return false;
    }

    public List<News> getAllNews() {
        return newsRepository.findAll();

    }
}
