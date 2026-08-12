package ConditionalStatement;

import java.util.Scanner;

public class Task17mf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the day of the week: ");
        int weekDay = scanner.nextInt();
        String dayName;
        String status;
        switch (weekDay) {
            case 1:
                dayName = ("Monday");
                break;
            case 2:
                dayName = ("Tuesday");
                break;
            case 3:
                dayName = ("Wednesday");
                break;
            case 4:
                dayName = ("Thursday");
                break;
            case 5:
                dayName = ("Friday");
                break;
            case 6:
                dayName = ("Saturday");
                break;
            case 7:
                dayName = ("Sunday");
                break;
            default:
                dayName = ("Invalid day");
                break;
        }
        if (weekDay == 1 || weekDay == 2 || weekDay == 3 || weekDay == 4 || weekDay == 5) {
            status = "Study Day";
        } else if (weekDay == 6 || weekDay == 7) {
            status = "Weekend Day";
        } else {
            status = "Invalid Day";
        }
        System.out.println("========================");
        System.out.println("      STUDY PLANNER");
        System.out.println("========================");
        System.out.println("Name: " + name);
        System.out.println("Day: " + dayName);
        System.out.println("Status: " + status);
        System.out.println("========================");
    }
}
