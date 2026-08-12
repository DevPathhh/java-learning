package ConditionalStatement;
public class Task11 {
    public static void main(String[] args) {
        String command = "start";

        switch(command) {
            case "start":
                System.out.println("Process started");
                break;
            case "stop":
                System.out.println("Process stopped");
                break;
            case "pause":
                System.out.println("Process stoped");
                break;
            default:
                System.out.println("Unknown command");
        }
    }
}

