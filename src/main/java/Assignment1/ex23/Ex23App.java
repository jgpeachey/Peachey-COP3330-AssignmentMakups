/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package Assignment1.ex23;

import java.util.Scanner;

public class Ex23App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Is the car silent when you turn the key?");
        String answer = in.nextLine();
        if(answer.equalsIgnoreCase("y")){
            System.out.println("Are the battery terminals corroded?");
            answer = in.nextLine();
            if(answer.equalsIgnoreCase("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else if(answer.equalsIgnoreCase("n")){
                System.out.println("Replace cables and try again.");
            }
        }
        else if(answer.equalsIgnoreCase("n")){
            System.out.println("Does the car make a slicking noise?");
            answer = in.nextLine();
            if(answer.equalsIgnoreCase("y")){
                System.out.println("Replace the battery.");
            }
            else if(answer.equalsIgnoreCase("n")){
                System.out.println("Does the car crank up but fail to start?");
                answer = in.nextLine();
                if(answer.equalsIgnoreCase("y")){
                    System.out.println("Check spark plug connections.");
                }
                else if(answer.equalsIgnoreCase("n")){
                    System.out.println("Does the engine start and then die?");
                    answer = in.nextLine();
                    if(answer.equalsIgnoreCase("y")){
                        System.out.println("Does your car have fuel injection?");
                        answer = in.nextLine();
                        if(answer.equalsIgnoreCase("y")){
                            System.out.println("Get it in for service.");
                        }
                        else if(answer.equalsIgnoreCase("n")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if(answer.equalsIgnoreCase("n")){
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
