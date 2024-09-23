package newarch.repo;

import newarch.model.Vision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisionRepository extends JpaRepository<Vision, Long> {
}
