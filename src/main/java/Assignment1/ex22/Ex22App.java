/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package Assignment1.ex22;

import java.util.Scanner;

public class Ex22App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter first number: ");
        int num2 = in.nextInt();
        System.out.println("Enter first number: ");
        int num3 = in.nextInt();

        if(allDif(num1, num2, num3)){
            System.out.println("The largest number is "+maxNum(num1, num2, num3));
        }
    }

    public static boolean allDif(int a, int b, int c){
        boolean different = false;
        if(a != b && a != c && c != b){
            different = true;
        }
        return different;
    }

    public static int maxNum(int a, int b, int c){
        int max = 0;
        if (a > max){
            max = a;
        }
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max;
    }
}
