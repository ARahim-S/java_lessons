package tasks;

import java.util.Scanner;

public class Task01Answer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your demand");
        String customerDemand = input.next();
        double currentMoney = 1000;

        if (customerDemand.equalsIgnoreCase("balance")) {
            System.out.println("currentMoney = " + currentMoney);
        } else if (customerDemand.equalsIgnoreCase("deposit")) {
            System.out.println("Ne kadar yatırmak istiyorsunuz?");
            int deposit = input.nextInt();
            currentMoney = depositMoney(currentMoney, deposit);
            System.out.println("Bakiyeniz artık: " + currentMoney + " oldu...");

        } else if (customerDemand.equalsIgnoreCase("withdraw")) {
            System.out.println("Ne kadar çekmek istiyorsunuz?");
            int withdraw = input.nextInt();
            if (withdraw > currentMoney) {
                System.out.println("yeterli bakiyeniz yoktur.");
            } else {
                currentMoney = withdrawMoney(currentMoney, withdraw);
                System.out.println("Bakiyeniz artık :" + currentMoney + " oldu...");
            }


        } else {
            System.out.println("Lütfen geçerli bir rakam giriniz.");
        }

    }

    public static double withdrawMoney(double current, double a) {
        return current - a;
    }

    public static double depositMoney(double current, double b) {
        return current + b;
    }


}
