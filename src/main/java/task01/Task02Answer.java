package task01;

import java.util.Scanner;

public class Task02Answer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz..");
        String userInputString = input.next();
        System.out.println("Lütfen bir sayı giriniz...");
        int userInputInt = input.nextInt();

        int userInputLength = userInputString.length();
        char firstletter = userInputString.charAt(0);
        char lastLetter = userInputString.charAt(userInputLength-1);
        String firstLast = ""+firstletter+lastLetter;
        System.out.println("firstLast = " + firstLast);

        for(int i = 0; i<userInputInt;i++){
            System.out.print(firstLast);
        }


    }
}
