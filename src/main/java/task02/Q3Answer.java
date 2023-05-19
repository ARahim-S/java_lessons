package task02;

import java.util.Scanner;

public class Q3Answer {
    /*
        Q03
        TASK :
        Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        INFO :
        BMI = kilo(kg) /(boy*boy)(m)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

        BMI (Body Mass Index)


     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How tall are you? Please enter in meters");
        double userTall = scan.nextDouble();
        System.out.println("How many kilos are you? Please enter in kilograms");
        int userKg = scan.nextInt();
        double resultBmi = userKg / (userTall * userTall);
        if (resultBmi <= 20) {
            System.out.println("Your BMI is ==> " + resultBmi + " ==> " + "You are underweight");
        } else if (resultBmi > 20 && resultBmi <= 25) {
            System.out.println("Your BMI is ==> " + resultBmi + " ==> " + "You are normal weight");
        } else if (resultBmi > 25 && resultBmi <= 30) {
            System.out.println("Your BMI is ==> " + resultBmi + " ==> " + "You are overweight ");
        } else if (resultBmi > 30) {
            System.out.println("Your BMI is ==> " + resultBmi + " ==> " + "You are obesity ");
        } else {
            System.out.println("Try again...");
        }

    }

}
