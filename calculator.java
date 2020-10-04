import java.util.Scanner;

public class calculator 
{
    public void total_marks(int English,int Physics,int Chemistry,int Math,int CS)
    {
        float Total_marks=(English+Physics+Chemistry+Math+CS);
        System.out.format("The total mark is %d out of 500%n",(int)Total_marks);

        System.out.format("The precentage you occured: %.2f",(Total_marks/500)*100);
    }

    public static void main(String[]args)
    {
        Scanner marks= new Scanner(System.in);

        System.out.println("Enter Your marks in English out of 100: ");
        int English= marks.nextInt();

        System.out.println("Enter Your marks in Physics out of 100: ");
        int Physics= marks.nextInt();

        System.out.println("Enter Your marks in Chemistry out of 100: ");
        int Chemistry= marks.nextInt();

        System.out.println("Enter Your marks in Math out of 100: ");
        int Math= marks.nextInt();

        System.out.println("Enter Your marks in CS out of 100: ");
        int CS= marks.nextInt();

        calculator obj= new calculator();
        obj.total_marks(English,Physics,Chemistry,Math,CS);

        marks.close();

    }    
}
