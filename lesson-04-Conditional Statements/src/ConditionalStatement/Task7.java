package ConditionalStatement;

public class Task7 {
    public static void main(String[] args) {
        int score = 72;

        if (score > 100) {
            System.out.println("Invalid score");
        } else if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

    }
}
