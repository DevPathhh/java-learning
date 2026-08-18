public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {41, 38, 31, 25, 11, 22, 19, 30, 1000320, 4021};
        int min = numbers[0];
        for(int number: numbers) {
            if(min > number) {
                min = number;
            }
        }
        System.out.println(min);
    }
}
