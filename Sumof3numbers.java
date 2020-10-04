//Code With Harry JAVA practice set Question no.1
//I'm solved this problem using 'Return type with no argument' Function

import java.util.*;
public class Sumof3numbers 
{
    public int sum()
    {
        Scanner add= new Scanner(System.in);
        int sum=0;
        for (int i=1; i<=3;i++)
        {
            System.out.format("Enter %d numer: ",i);
            int num=add.nextInt();
            sum+=num;
        }   
        add.close();
        return sum;
    }    

    public static void main (String[]args) 
    {
        Sumof3numbers obj = new Sumof3numbers();
        System.out.println("The result is: "+obj.sum());

    }
}
