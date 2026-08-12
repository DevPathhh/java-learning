package ConditionalStatement;

public class Task4 {
    public static void main(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }
}
