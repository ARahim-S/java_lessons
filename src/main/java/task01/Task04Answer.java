package task01;

import java.util.Scanner;

public class Task04Answer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ad soyad giriniz...");
        String userName = input.nextLine();
        String firstName = userName.split(" ")[0];
        String lastName = userName.split(" ")[1];
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

    }
}
