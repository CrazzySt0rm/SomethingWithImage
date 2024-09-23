package newarch.dto.vision;

import java.util.List;

public record Line(
        BoundingBox boundingBox,
        String text,
        List<Word> words,
        List<TextSegment> textSegments,
        String orientation
) {

    @Override
    public String toString() {
        return "Line{" +
                "boundingBox=" + boundingBox +
                ", LINE text='" + text + '\'' +
                ", words=" + words +
                ", textSegments=" + textSegments +
                ", orientation='" + orientation + '\'' +
                '}';
    }
}
