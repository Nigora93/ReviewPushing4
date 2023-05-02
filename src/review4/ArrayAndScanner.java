package review4;

import java.util.Scanner;

public class ArrayAndScanner {
    public static void main(String[] args) {
        /*
        create an array that stores numbers from a user
        then we want to calculate the avarage numbers
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers do you want to store?");

        int size = scan.nextInt();

        int [] numbers = new int[size];

        
        //option length only works with arrays
        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Please enter " + (i + 1 )+ " element");
            numbers[i] = scan.nextInt();
        }


    }
}
