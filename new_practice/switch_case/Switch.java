import java.util.Scanner;

public class Switch {
    static void weekName(int weekNumber) {
        switch (weekNumber) {
            case 1:
                System.out.println("Sunday");
                return;
            case 2:
                System.out.println("Monday");
                return;
            case 3:
                System.out.println("Tuesday");
                return;
            case 4:
                System.out.println("Wednesday");
                return;
            case 5:
                System.out.println("Thursday");
                return;
            case 6:
                System.out.println("Friday");
                return;
            case 7:
                System.out.println("Saturday");
                return;

            default:
                System.out.println("Invalid entry");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the week number");
        Scanner input=new Scanner(System.in);
        int weekNumber=input.nextInt();
        input.close();
        weekName(weekNumber);
    }
}