import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    String id;
    String name;
    String address;
    float grade;
}
