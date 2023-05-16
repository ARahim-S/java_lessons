package day10ifstatements;

import java.util.Scanner;

public class Homework {
            /*
            Homework
            1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
            uygun mesaj veren kodu yaziniz

            2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
            Pazar ==> 1. gun , Pazartes ==> 2. gun...

            3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
            1==>January , 2==> February
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter password...");
        String pwd = input.next();

        //Answer 1)

        if(pwd.equals("pwd123!")){
            System.out.println("Password is correct");
        }else{
            System.out.println("Password is not correct");
        }

        //Answer 2)
        System.out.println("Please enter name of the day of the week...");
        String dayName = input.next();
        if(dayName.equalsIgnoreCase("sunday")){
            System.out.println("First day of the week");
        } else if (dayName.equalsIgnoreCase("monday")) {
            System.out.println("Second day of the week");
        }else if (dayName.equalsIgnoreCase("tuesday")) {
            System.out.println("Third day of the week");
        }else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println("Fourth day of the week");
        }else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println("Fifth day of the week");
        }else if (dayName.equalsIgnoreCase("friday")) {
            System.out.println("Sixth day of the week");
        }else if (dayName.equalsIgnoreCase("saturday")) {
            System.out.println("Seventh day of the week");
        }else{
            System.out.println("Please enter correct name of the day");
        }

        //Answer 3)
        System.out.println("Please enter name of the month of the year...");
        String monthName = input.next();
        if(monthName.equalsIgnoreCase("January")){
            System.out.println("First month of the year");
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println("Second month of the year");
        } else if (monthName.equalsIgnoreCase("March")) {
            System.out.println("Third month of the year");
        } else if (monthName.equalsIgnoreCase("April ")) {
            System.out.println("Fourth month of the year");
        } else if (monthName.equalsIgnoreCase("May")) {
            System.out.println("Fifth month of the year");
        } else if (monthName.equalsIgnoreCase("June")) {
            System.out.println("Sixth month of the year");
        } else if (monthName.equalsIgnoreCase("July")) {
            System.out.println("Seventh month of the year");
        } else if (monthName.equalsIgnoreCase("August")) {
            System.out.println("Eight month of the year");
        } else if (monthName.equalsIgnoreCase("September")) {
            System.out.println("Ninth month of the year");
        } else if (monthName.equalsIgnoreCase("October")) {
            System.out.println("Tenth month of the year");
        } else if (monthName.equalsIgnoreCase("November")) {
            System.out.println("Eleventh month of the year");
        } else if (monthName.equalsIgnoreCase("December")) {
            System.out.println("Twelfth month of the year");
        }else{
            System.out.println("Please correct name of the month");
        }

    }
}
