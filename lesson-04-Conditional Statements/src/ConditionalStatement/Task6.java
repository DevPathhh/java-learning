package ConditionalStatement;

public class Task6 {
    public static void main(String[] args) {
        int temperature = 25;

        if (temperature >= 30) {
            System.out.println("It's hot");
        } else if (temperature >= 20) {
            System.out.println("It's warm");
        } else if (temperature >= 10) {
            System.out.println("It's cool");
        } else
            System.out.println("It's cold");
    }
}
