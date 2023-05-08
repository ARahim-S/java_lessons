package day04scannerwrapper;

import java.util.Scanner;

public class Homework04 {
    //homework
    //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
    //ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
    //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
    // ornegin => 312 icin 3+1+2=6
    public static void main(String[] args) {

        //Answer 1 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 3 sayı giriniz...");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        double result = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Ortalama = " + result);
        //Answer 2;
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz...");
        int number = input.nextInt();
        int lastDigit = number % 10;
        number = number / 10;
        int secondDigit = number % 10;
        number = number / 10;
        int firstDigit = number % 10;
        int sumDigitResult = lastDigit + secondDigit + firstDigit;
        System.out.println("sumDigitResult = " + sumDigitResult);
    }
}