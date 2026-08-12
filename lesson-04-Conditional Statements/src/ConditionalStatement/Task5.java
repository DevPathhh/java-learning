package ConditionalStatement;

public class Task5 {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 70)
            System.out.println("Good");
        else if (score > 49) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }
    }
}