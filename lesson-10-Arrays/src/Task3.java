public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {-3, 2, 4, -20, 45, 32, -46, 74};
        int max = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
