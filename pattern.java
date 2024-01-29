public class pattern
{
    public static void main(String[] args)
    {
        for (int i = 5; i > 0; i--)//outer loop for rows
        {
            for (int j = 5; j > 0; j--)//inner loop for columns
            {
                if(j>i)//checking current column is j or not 
                    System.out.print(" " + j);
                else {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        }
    }
}











