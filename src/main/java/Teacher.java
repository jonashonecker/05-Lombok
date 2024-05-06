import lombok.Builder;
import lombok.With;

import java.util.List;

@Builder
@With
public record Teacher (
        String id,
        String name,
        List<String> subject
) {}
