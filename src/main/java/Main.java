import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = Student.builder()
                .id("123")
                .grade(1.3F)
                .name("Otto")
                .address("12345 abcdfef")
                .build();

        Student s2 = new Student("456", "Sieglinde", "444333 Böblingen", 1.0F);

        Teacher t1 = new Teacher("1", "Friedrich", List.of("Mathematik", "Deutsch"));
        Teacher t2 = new Teacher("2", "Siegrid", List.of("Physik", "Chemie"));

        Course c1 = new Course("001", "Bildende Kunst", t1, List.of(s1, s2));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(c1);

        System.out.println(s1.getId());
        System.out.println(c1.getStudentList());
        s1.setId("HALLO");
        System.out.println(s1.getId());

        Teacher t3 = t2.withSubject(List.of("Französisch", "Griechisch"));
        System.out.println(t3);

        Course c3 = Course.builder()
                .id("111")
                .name("Sport")
                .studentList(List.of(s1, s2))
                .teacher(t1)
                .build();

        System.out.println(c3);

        Teacher t4 = Teacher.builder()
                .id("11")
                .name("Biwof")
                .subject(List.of("Informatik"))
                .build();

        System.out.println(t4);

        Teacher t5 = t4.withSubject(List.of("hwfewhio", "hwifowehoi")).withName("Franz");

        System.out.println(t5);



    }
}
