import java.util.*;
public class range
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Starting point:");
        int x = sc.nextInt();//Getting input and storing at x

        System.out.print("Ending point:");
        int y = sc.nextInt();//Getting input and storing at y

        System.out.println("______________________");
        System.out.println("NUMBERS FROM " + x +" TO "+ y);
        System.out.println("______________________");

        //loop to traverse from x to y 
        for(int i=x ; i<=y ; i++)
        {
            System.out.println(x);//prints x 
            x++;//To increament the c=value of x 
        }



    }

}
