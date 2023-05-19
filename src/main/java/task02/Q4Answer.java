package task02;

import java.util.Scanner;

public class Q4Answer {

    /*
    Q04
    /TASK :
         Kullanicidan IT alanini bilgisini alarak console'a
         meslegi = qa ==> Quality Analyst
                     dev ==> Developer
                      ba ==> Busines Analyst
                      pm ==> Project Manager
        bilgilileri yazdiriniz

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your IT Title");
        System.out.println("qa\ndev\nba\npm");
        String userInput = input.next();

        if(userInput.equalsIgnoreCase("qa")){
            System.out.println("Quality Analyst");
        } else if (userInput.equalsIgnoreCase("dev")) {
            System.out.println("Developer");
        } else if (userInput.equalsIgnoreCase("ba")) {
            System.out.println("Business Analyst");
        } else if (userInput.equalsIgnoreCase("pm")) {
            System.out.println("Project Manager");
        }else{
            System.out.println("Please try again...");
        }
    }
}
