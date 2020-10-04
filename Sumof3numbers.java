//Code With Harry JAVA practice set Question no.1
// I've solved this problem using the function 'Return type with no argument' 

import java.util.*;
public class Sumof3numbers 
{
    public int sum()
    {
        Scanner add= new Scanner(System.in);
        int sum=0;
        for (int i=1; i<=3;i++)
        {
            System.out.format("Enter numer %d: ",i,i);
            int num=add.nextInt();
            sum+=num;
        }   
        add.close();
        return sum;
    }    

    public static void main (String[]args) 
    {
        Sumof3numbers obj = new Sumof3numbers();
        System.out.println("The addition of 3 numbers is: "+obj.sum());

    }
}
