package newarch.dto.vision;

import java.util.List;

public record Block(
        BoundingBox boundingBox,
        List<Line> lines,
        List<Language> languages,
        List<TextSegment> textSegments,
        String fullText,
        String rotate
) {

    @Override
    public String toString() {
        return "Block{" +
                "boundingBox=" + boundingBox +
                ", lines=" + lines +
                ", languages=" + languages +
                ", textSegments=" + textSegments +
                ", fullText='" + fullText + '\'' +
                ", rotate='" + rotate + '\'' +
                '}';
    }
}

