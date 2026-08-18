public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {5, 10, 15, 20};
        for(int number : numbers) {
            sum +=number;
        }
        System.out.println(sum);
    }
}
