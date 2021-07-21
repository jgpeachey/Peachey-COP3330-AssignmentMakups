package Assignment2.ex37;

import java.util.*;

public class PasswordGenerator {
    private ArrayList<String> specialCharacters = new ArrayList<>(
            Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*")
    );

    Random rnd = new Random();

    public String getRandomLetter(){
        char temp = (char) ('a' + rnd.nextInt(26));
        String letter = Character.toString(temp);
        if (rnd.nextInt(2) == 0){
            letter = letter.toUpperCase();
        }
        return letter;
    }

    public String getRandomNumber(){
        String number = Integer.toString(rnd.nextInt(10));
        return number;
    }

    public String getRandomSpecial(){
        String special = specialCharacters.get(rnd.nextInt(8));
        return special;
    }

    public String randomizeString(String password){
        List<String> temp = Arrays.asList(password.split(""));
        Collections.shuffle(temp);
        StringBuilder randPass = new StringBuilder();
        for (String character : temp) {
            randPass.append(character);
        }
        return randPass.toString();
    }

    public String createPassword(Map<String, Integer> input){
        StringBuilder password = new StringBuilder();
        int length = 0;
        for (int i = 0; i < input.get("numbers"); i++) {
            password.append(getRandomNumber());
            length++;
        }
        for (int i = 0; i < input.get("special"); i++) {
            password.append(getRandomSpecial());
            length++;
        }
        while (length != input.get("length")){
            password.append(getRandomLetter());
            length++;
        }
        return randomizeString(password.toString());
    }
}
