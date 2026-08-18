public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
