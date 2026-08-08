import java.util.Scanner;

public class HyperMiniProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your daily gaming hours: ");
        double gamingHours = scanner.nextDouble();
        scanner.nextLine();

        boolean adult = age >= 18.0;
        boolean gamerEnough = gamingHours >= 3.0;
        int ageNextYear = age+1;
        double halfOfAge = age / 2.0;

        System.out.println("========================");
        System.out.println("      PLAYER PROFILE");
        System.out.println("========================");
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Adult: " + adult);
        System.out.println("Gamer enough: " + gamerEnough);
        System.out.println("Age next year: " + ageNextYear);
        System.out.println("Half of age: " + halfOfAge);
        System.out.println("========================");
    }
}
