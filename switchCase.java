public class switchCase {
    public static void main(String[] args) {
        int grade = 78;
        if (grade >= 90)
            grade = 'A';
        else if (grade >= 80)
                grade = 'B';
        else if (grade >= 70)
                grade = 'C';
        else if (grade >= 60)
                grade = 'D';
        else if (grade < 0 || grade > 100) // || = OR
                grade = 'E';
        switch (grade) {
            case 'A':
                System.out.println("You get an A");
                break;
            case 'B': 
                System.out.println("You get a B");
                System.out.println("Failure");
                break;
            case 'C': 
                System.out.println("You got a C");
                break;
            case 'D':
                System.out.println("You got a D");
                break;
            case 'E':
                System.out.println("Invalid entry");
                break;
            default:
                System.out.println("You got a F");
                System.out.println("...");
                break;
        }
    }
}