package array;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        int input =0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter count");
        int count=in.nextInt();
        int[] arr =new int[count];
        System.out.println("Enter Number");

        for (int i = 0; i < count; i++) {

            input = in.nextInt();
            arr[i] =input;

        }

        for (int j = 0; j < count; j++) {

            System.out.println("Index " +(j+1)+" is "+arr[j]);

        }
    }
}
