import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.OptionalDouble;

public class UniversityService {
    /*

    Write a function to calculate the average grade of a Course (Pass the Course as a parameter).

    Write a function to calculate the average grade of the entire University (Pass a University object as a parameter).

    Write a function that retrieves all students from a University with a minimum grade of 2/"Good" and returns them as a list (Pass a University object as a parameter).
     */
    static BigDecimal calcAverageGrade(Course c) {
        return c.getStudentList().stream()
                .map(Student::getGrade)
                .map(g -> new BigDecimal(g.toString()))
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(c.getStudentList().size()), 4,RoundingMode.HALF_UP);
    }
}
