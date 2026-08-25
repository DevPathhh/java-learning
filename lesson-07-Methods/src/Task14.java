public class Task14 {
    static void main(String[] args) {
        String info = checkAge(11);
        System.out.println(info);
    }
    static String checkAge(int age) {
        if (age >= 18) {
            return "Adult";
        }
        return "Minor";
    }
}
