package Code;

import java.util.Scanner;

/**
 * Created by iceman on 11/30/2016.
 */

/**
 * Sum of prime integers in an array
 * */
public class SumPrimes1ToN {
    static Scanner in = new Scanner(System.in);

    public static void main(String ars[]) {

        SumPrimes1ToN obj = new SumPrimes1ToN();
        obj.SumOfPrimes();
    }


    public void SumOfPrimes() {
        System.out.println("Enter the number of elements required in the array:");
        int numberOfElement = in.nextInt();
        int[] numbers = new int[numberOfElement];
        for (int i = 0; i < numberOfElement; i++) {
            System.out.println("Enter the value for Array element " + i + " : ");
            numbers[i] = in.nextInt();
        }
        int sum = 0;
        if (numbers == null || numbers.length == 0) {
            System.out.println("Sum of numbers is 0");
        } else {
            int j;
            for (int n : numbers) {
                if (n == 1)
                    continue;
                boolean isPrime = true;
                for (j = 2; j <= n / 2; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sum += n;
                }
            }
        }
        System.out.println("Sum of numbers is : "+sum);
    }
}
