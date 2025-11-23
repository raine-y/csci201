public class StudentObj {

    // attributes

    private final int id;
    private final String firstName;
    private final String lastName;
    private int score;

    // constructor (~always has the same name as the class)

    public StudentObj(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // overloading constructors
    public StudentObj(int id, String firstName, String lastName, int score) {
        this(id, firstName, lastName); // constructor to constructor communications
        this.score = score;
    }

    // getters (public methods to access private attributes)

    public int id() {
        return id;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int score() {
        return score;
    }

    // setters (public methods to modify private attributes)

    public void setScore(int score) {
        this.score = score;
    }

    // operations (other public methods)

    public char letterGrade() {
        if (score >= 90)
            return 'A';
        if (score >= 80)
            return 'B';
        if (score >= 70)
            return 'C';
        if (score >= 60)
            return 'D';
        return 'F';
    }

    // overriding toString() method

    public String toString() {
        return "Student ID: " + id + ", Name: " + firstName + " " + lastName + ", Score: " + score + "% ["
                + letterGrade() + "]";
    }
}