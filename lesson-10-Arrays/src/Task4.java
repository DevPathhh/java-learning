import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {10, -32, 32, 45};
        int[] copy = Arrays.copyOf(numbers, 3);
        for(int i : copy) {
            System.out.println(i);
        }
    }
}
