package task01;

import java.util.Scanner;

public class Task05Answer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name that includes 3 words...");
        String userName = input.nextLine().toUpperCase();
        char firstName = userName.split(" ")[0].charAt(0);
        char middleName = userName.split(" ")[1].charAt(0);
        char lastName = userName.split(" ")[2].charAt(0);

        System.out.println(firstName + "." + middleName + "." + lastName + ".");


    }
}
