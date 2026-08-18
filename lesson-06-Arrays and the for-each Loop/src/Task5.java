public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 5, 20, 7, 14};
        int count = 0;
         for(int number : numbers){
             if(number % 2 == 0){
                 ++count;
             }
         }
        System.out.println(count);
    }
}
