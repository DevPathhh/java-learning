public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 18, 3, 27, 8};
        int count = 0;
        for(int number : numbers){
            if(number > 10){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
