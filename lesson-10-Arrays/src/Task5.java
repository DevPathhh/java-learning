public class Task5 {
    public static void main(String[] args) {
        int[] source = {15, 27, 39, 51, 63};
        int[] destination = new int[3];
        System.arraycopy(source, 0, destination, 0, 3);
        for(int i : destination) {
            System.out.println(i);
        }
    }
}
