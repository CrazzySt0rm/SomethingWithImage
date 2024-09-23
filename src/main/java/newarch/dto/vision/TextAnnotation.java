package newarch.dto.vision;

import java.util.List;

public record TextAnnotation(
        int width,
        int height,
        List<Block> blocks,
        List<String> entities,
        List<String> tables,
        String fullText,
        String rotate
) {

    @Override
    public String toString() {
        return "TextAnnotation{" +
                "width=" + width +
                ", height=" + height +
                ", blocks=" + blocks +
                ", entities=" + entities +
                ", tables=" + tables +
                ", Ta fullText='" + fullText + '\'' +
                ", rotate='" + rotate + '\'' +
                '}';
    }
}
