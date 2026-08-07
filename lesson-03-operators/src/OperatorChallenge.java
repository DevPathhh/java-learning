import java.util.Scanner;

public class OperatorChallenge  {
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
        System.out.print("Enter your daily study hours: ");
        double studyHours = scanner.nextDouble();


        int ageStandard = 17;
        int ageOlderThan = 13;
        boolean adult = age > ageStandard;
        boolean teenager = (age <= ageStandard) && (age >= ageOlderThan);

        int hours = 3;
        boolean studyNorm = studyHours >= hours;

        int ageNextYear = age + 1;
        double halfAge = age / 2.0;

        System.out.println("========================");
        System.out.println("          REPORT");
        System.out.println("========================");
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Height: " + height);
        System.out.println("Adult: " + adult);
        System.out.println("Teenager: " + teenager);
        System.out.println("Studies enough (>=3 hours): " + studyNorm);
        System.out.println("Age Next Year: " + ageNextYear);
        System.out.println("Half of your age: " + halfAge);




































    }
}
