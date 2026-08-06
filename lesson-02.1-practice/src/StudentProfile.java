import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your country: ");
        String country = scanner.nextLine();
        System.out.print("Enter your university: ");
        String university = scanner.nextLine();
        System.out.print("Enter your favorite programming language: ");
        String programmingLanguage = scanner.nextLine();
        System.out.print("How many hours do you study programming every day?: ");
        int studyHours = scanner.nextInt();
        scanner.nextLine();

        System.out.println("==============================");
        System.out.println("        Student Profile");
        System.out.println("==============================");
        System.out.printf("Name: %s.%s%n", firstName, lastName);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("University: " + university);

        System.out.println("Favorite programming language: " + programmingLanguage);
        System.out.println("Programming: " + studyHours + " hours/day");
        System.out.println("==================================================");
        System.out.println("   Good luck on your Backend Developer journey!");
        System.out.println("==================================================");











    }
}
