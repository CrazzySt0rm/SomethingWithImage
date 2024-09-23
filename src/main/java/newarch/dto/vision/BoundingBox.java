package newarch.dto.vision;

import java.util.List;

public record BoundingBox(
        List<Vertex> vertices
) {}
