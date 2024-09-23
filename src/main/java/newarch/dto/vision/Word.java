package newarch.dto.vision;

import java.util.List;

public record Word(
        BoundingBox boundingBox,
        String text,
        int entityIndex,
        List<TextSegment> textSegments
) {}
