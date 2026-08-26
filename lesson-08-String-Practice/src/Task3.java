public class Task3 {
    public static void main(String[] args) {
        String text = " I love Python lalala";
        String text1 = text.trim();
        String text2 = text1.replace("Python", "Java");
        String text3 = text2.substring(0, 12);
        System.out.println(text3);
    }
}
