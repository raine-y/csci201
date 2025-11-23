public class GradStudentObj extends StudentObj {

    // attributes specific to GradStudentObj

    private String researchTopic = "Undeclared";

    // subclass constructor
    public GradStudentObj(int id, String firstName, String lastName) {
        super(id, firstName, lastName); // calling superclass constructor
    }

    public GradStudentObj(int id, String firstName, String lastName, int score) {
        super(id, firstName, lastName, score); // calling superclass constructor
    }

    public GradStudentObj(int id, String firstName, String lastName, int score, String researchTopic) {
        super(id, firstName, lastName, score); // calling overloaded superclass constructor
        this.researchTopic = researchTopic;
    }

    // overriding toString() method

    public String toString() {
        return super.toString() + ", Research Topic = " + researchTopic; // calling superclass toString() method
    }
}