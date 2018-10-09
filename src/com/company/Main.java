package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception{
        Scanner src = new Scanner(System.in);

        // creating loop to store 5 values.
        String [] array = new String[5];

        // asking user to enter 5 values.
        System.out.println("Enter your five words!");

        // for loop to get input five times.
        for( int i = 0; i < 5; i++){
            // storing the strings in the respective array.
         array[i] = src.nextLine();
        }
        System.out.println(array[0]);// for test.

        // done with loopy.

        boolean redEyes;
        String response = "y";

        while(!response .equalsIgnoreCase("n")){
        System.out.println("Are your eyes red?");
        response =  src.nextLine();

        if(response .equalsIgnoreCase("y")||
                (response .equalsIgnoreCase("Yes"))){
            System.out.println("Get some sleep");

        }else{
           System.out.println("Get some sleep");
        }


            System.out.println("Do you want to try again?");
            response = src.nextLine();

    }










    }
}
