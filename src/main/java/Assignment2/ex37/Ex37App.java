package Assignment2.ex37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex37App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordGenerator pg = new PasswordGenerator();
        Ex37App app = new Ex37App();

        Map<String, Integer> input = app.inputGetter();

        app.outputGetter(pg.createPassword(input));
    }

    public Map<String, Integer> inputGetter(){
        Map<String, Integer> input = new HashMap<>();
        System.out.println("What's the minimum length?");
        input.put("length", in.nextInt());
        System.out.println("How many special characters?");
        input.put("special", in.nextInt());
        System.out.println("How many numbers?");
        input.put("numbers", in.nextInt());
        if (input.get("length")/2 < (input.get("special")+input.get("numbers"))){
            System.out.println("Password must have at least as many letters as are there are special characters and numbers.");
            System.exit(-1);
        }
        return input;
    }

    public void outputGetter(String password){
        System.out.println("Your password is "+password);
    }
}
