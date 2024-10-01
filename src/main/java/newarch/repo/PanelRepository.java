package newarch.repo;

import newarch.model.random.panel.Learn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PanelRepository {

    List<Learn> meow();
}
