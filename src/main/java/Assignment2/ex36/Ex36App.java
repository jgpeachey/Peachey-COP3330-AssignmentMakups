/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 John Peachey
 */

package Assignment2.ex36;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Ex36App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Ex36App app = new Ex36App();

        ArrayList<Double> input = app.inputGetter();

        calc.calculate(input);

        app.outputGetter(input, calc.getCalculations());
    }

    public ArrayList<Double> inputGetter(){
        ArrayList<Double> input = new ArrayList<>();
        String answer = "";
        while (!answer.equalsIgnoreCase("done")) {
            System.out.println("Enter a Number: ");
            answer = in.nextLine();
            if (!answer.equalsIgnoreCase("done")) {
                input.add(Double.parseDouble(answer));
            }
        }
        return input;
    }

    public void outputGetter(ArrayList<Double> input, Map<String, Double> calculations){
        System.out.print("Numbers: ");
        for (int i = 0; i < input.size(); i++) {
            if (i != input.size()-1) {
                System.out.print(input.get(i) + ", ");
            }
            else {
                System.out.println(input.get(i));
            }
        }
        System.out.println("The average is: "+calculations.get("avg"));
        System.out.println("The minimum is: "+calculations.get("min"));
        System.out.println("The maximum is: "+calculations.get("max"));
        System.out.println("The standard deviation is: "+calculations.get("std"));
    }
}
