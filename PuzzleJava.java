import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> tenRandomRoll = new ArrayList<Integer>();
        for(int i = 1; i < 11; i++){
            tenRandomRoll.add(randMachine.nextInt(21));
        }
        return tenRandomRoll;
    }

    public String getRandomLetter(){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char randomLetter = letters.charAt(randMachine.nextInt(26));
        return String.valueOf(randomLetter);
    }

    public String generatePassword(){
        String password = "";
        for (int i = 1; i <= 8; i++){
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

}