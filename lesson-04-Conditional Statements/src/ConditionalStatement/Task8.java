package ConditionalStatement;

public class Task8 {
    public static void main(String[] args) {
        int balance = 150;

        if (balance >= 1000) {
            System.out.println("Rich");
        } else if (balance >= 500) {
            System.out.println("Comfortable");
        } else if (balance >= 100) {
            System.out.println("Normal");
        } else {
            System.out.println("Low balance");
        }
    }
}
