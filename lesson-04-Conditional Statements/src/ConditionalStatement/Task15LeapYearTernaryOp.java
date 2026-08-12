package ConditionalStatement;

public class Task15LeapYearTernaryOp {
    public static void main(String[] args) {
        int year = 1900;

        String result = (year % 4 == 0) && (year % 100 != 0) || (year%400 == 0) ? "Leap year" : "Not leap year";
        System.out.println(result);
    }
}
