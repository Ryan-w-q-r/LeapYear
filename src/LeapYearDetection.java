import java.util.Scanner;

public class LeapYearDetection {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
