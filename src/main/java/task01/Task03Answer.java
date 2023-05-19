package task01;

import java.util.Scanner;

public class Task03Answer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz...");
        String userInput = input.nextLine();

        int isWhiteSpace = userInput.replaceAll("\\S","").length();
        if(isWhiteSpace>0){
            System.out.println(isWhiteSpace + " boşluk karakteri girdiniz");
        }else{
            System.out.println("boşluksuz");
        }

    }
}
