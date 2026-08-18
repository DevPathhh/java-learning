public class Task10 {
    public static void main(String[] args) {
        int[] numbers = {5, 2};
        if (numbers[0] > numbers[1]) {
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }
    }
}
