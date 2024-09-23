package newarch.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "image_stat")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageStat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String name;
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "imageStat")
    private List<Image> images = new ArrayList<>();

    private LocalDateTime dateOfCreated;

    @PrePersist
    private void init() { dateOfCreated = LocalDateTime.now(); }


    private Long PreviewImageId;

    public void addImageToImageStat(Image image) {
        image.setImageStat(this);
        images.add(image);
    }
}
