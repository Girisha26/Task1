import java.util.*;
import java.lang.*;

public class discount {
    public static void main(String[] args)
    {

        int final_amount;
        int discount;

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter purchase amount :");
        int purchase_amount = sc.nextInt();

        if(purchase_amount <=500)
        {
            System.out.println("No discount");
        }
        else if (purchase_amount<=1000)
        {
            discount= purchase_amount * 10 / 100;
            final_amount = purchase_amount - discount;
            System.out.println(final_amount);
        }
        else
        {
            discount= purchase_amount * 20 / 100;
            final_amount = purchase_amount - discount;
            System.out.println(final_amount);
        }

    }
}
