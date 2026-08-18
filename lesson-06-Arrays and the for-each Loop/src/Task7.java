public class Task7 {
    public static void main(String[] args) {
        int[] numbers = {4, 12, 7, 25, 18, 3, 30};
        int count = 0;

        for(int number : numbers) {
            if(number % 2 == 0) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
