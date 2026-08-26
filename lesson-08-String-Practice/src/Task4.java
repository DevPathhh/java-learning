public class Task4 {
    public static void main(String[] args) {
        String text = "Java makes backend development interesting";
        String[] correction = text.split(" ");
        for(String result : correction) {
            System.out.println(result);
        }
    }
}
