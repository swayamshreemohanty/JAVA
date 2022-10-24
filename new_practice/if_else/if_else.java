import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Enter 1st number");
        a = input.nextInt();
        System.out.println("Enter 2nd number");
        b = input.nextInt();
       
        input.close();
        if (a < b) {
            System.out.format("%d is lesser than %d", a, b);
        } else {
            System.out.format("%d is greater than %d", a, b);
        }
    }
}