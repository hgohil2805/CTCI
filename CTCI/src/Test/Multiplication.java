package Test;

/**
 * Created by iceman on 10/20/2016.
 */
public class Multiplication {
    public static void main (String [] args)
    {
        System.out.println ("\t\t\tMultiplication Table");
        System.out.println ();

        System.out.println ("\t\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t");
        for (int i = 0; i <= 9; i++)
        {
            System.out.print("\t" +i);
            for (int j = 0; j <= 9; j++)
            {
                System.out.print("\t" + i * j);
            }
            System.out.println ();
        }
    }
}
