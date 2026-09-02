public class Task2 {
    public static void main(String[] args) {
        int numbers[] = {10, 27, -28, 72};
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 42) {
                found = true;
            }
        }
        if(found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
