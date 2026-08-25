public class Task6 {
    public static void main(String[] args) {
        String text = "I'm gonna travel to Germany";
        String[] result = text.split(" ");

        for (String word : result) {
            System.out.println(word);
        }
    }
}
