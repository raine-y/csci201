public class StudentTest {

    public static void main(String[] args) {

        StudentObj student1 = new StudentObj(1, "John", "Doe");
        student1.setScore(85);
        StudentObj student2 = new StudentObj(2, "Lenna", "Forsén", 95);

        System.out.println("Student 1: " + student1.firstName() + " " + student1.lastName() + ", ID: " + student1.id()
                + ", Grade: " + student1.score() + "% [" + student1.letterGrade() + "]");
        System.out.println("Student 2: " + student2.firstName() + " " + student2.lastName() + ", ID: " + student2.id()
                + ", Grade: " + student2.score() + "% [" + student2.letterGrade() + "]");

        System.out.println(student1); // overridden toString() in StudentObj class
        System.out.println(student2); // ...

        GradStudentObj gradStudent1 = new GradStudentObj(101, "Jane", "Smith");
        GradStudentObj gradStudent2 = new GradStudentObj(102, "Bob", "Johnson", 88, "Machine Learning");

        System.out.println(gradStudent1); // overridden toString() in GradStudentObj class
        System.out.println(gradStudent2); // ...
    }
}