package ConditionalStatement;

public class Task16LeapYearIfElse {
    public static void main(String[] args) {
        int year = 2000;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
            } else if (year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
    }
}
