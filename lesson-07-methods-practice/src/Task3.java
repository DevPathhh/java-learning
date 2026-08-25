public class Task3 {
    public static void main(String[] args) {
        String result = checkNumber(-5);
        System.out.println(result);
    }
    static String checkNumber(int number) {
        if (number > 0) {
            return "Positive";
        }
        return "Negative";
    }
}
