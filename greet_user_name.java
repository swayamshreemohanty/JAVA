//Code_with_Harry JAVA tutorial practice set Chapter 1

import java.util.Scanner;

public class greet_user_name 
{
    public static void main(String[]args) 
    {
        Scanner name=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String greet=name.nextLine();
        
        System.out.format("Hello %s, have a good day",greet);

        name.close();
    }    
}
