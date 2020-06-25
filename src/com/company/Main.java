package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         int  [] myValues= showIntegers(7);

        System.out.println(" the array is " + Arrays.toString(myValues));
            }
            public static int [] showIntegers(int number){


                System.out.println(" enter the values to be displayed " );
        int [] values = new int[number];
        for(int i=0;i<values.length;i++){


            values[i]= input.nextInt();
        }
        return values;

            }
            public static int minValue(int [] array){

        int minValue= Integer.MAX_VALUE;

        for(int i=0; i< array.length;i++)
        {
            int value = array[i];

            if (value < minValue) {
                minValue= value;
            }
        }
            return minValue;
        }


            }


