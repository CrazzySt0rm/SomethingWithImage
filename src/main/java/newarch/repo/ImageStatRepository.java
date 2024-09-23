package newarch.repo;

import newarch.model.ImageStat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageStatRepository extends JpaRepository<ImageStat, Long> {

    List<ImageStat> findByTitle(String title);

}
