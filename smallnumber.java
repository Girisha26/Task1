import java.util.*;
public class smallnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 :");
        int x = sc.nextInt();//getting valuse as input ansd storing at x

        System.out.print("Enter a number 2 :");
        int y = sc.nextInt();//getting valuse as input ansd storing at y

        System.out.print("Enter a number 3 :");
        int z = sc.nextInt();//getting valuse as input ansd storing at z

        if(x<=y && x<=z)//executes if x is smallest
        {
            System.out.println(x + " is the smallest number ");
        }
        else if (y<=z)//executes if y is smallest
        {
            System.out.println(y + " is the smallest number ");
        }
        else//executes if z is smallest
        {
            System.out.println(z + " is the smallest number ");

        }





    }
}
