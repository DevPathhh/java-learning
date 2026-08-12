package ConditionalStatement;

public class Task12 {
    public static void main(String[] args) {
        String command = "restart";
        switch (command) {

            case "start":
                System.out.println("Starting the process");
                break;
            case "stop":
                System.out.println("Stopping the process");
                break;
            case "pause":
                System.out.println("Pausing the process");
                break;
            case "restart":
                System.out.println("Restarting the process");
                break;
            default:
                System.out.println("Unknown command");

        }
    }
}
