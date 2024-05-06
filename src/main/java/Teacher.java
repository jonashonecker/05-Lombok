import lombok.With;

import java.util.List;

@With
public record Teacher (
        String id,
        String name,
        List<String> subject
) {}
