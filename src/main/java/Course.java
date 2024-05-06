import lombok.*;

import java.util.List;

@Value
@AllArgsConstructor
@Builder
public class Course {
    String id;
    String name;
    Teacher teacher;
    List<Student> studentList;
}
