import java.util.*;
public class neagtivepositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();//getiing input and storing at a 

        if(a >= 0)//excutes if a is greater or equal to 0
        {
            System.out.println("Result : " + a +" is a positive number");
        }
        else//exectues esle part if a is lesser than 0
        {
            System.out.println("Result : " + a +" is a neagtive number");

        }



    }
}
