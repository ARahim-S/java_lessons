package day10ifstatements;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
    /*  Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers..");

        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());

        boolean isTriangle = (a + b > c && c > Math.abs(a - b)) &&  // a+b>c>|a-b|)
                (a + c > b && b > Math.abs(a - c)) &&  // a+c>b>|a-c|
                (b + c > a && a > Math.abs(b - c));    // b+c>a>|b-c|

        if (isTriangle) {

            if (a == b && b == c && a == c) {
                System.out.println("Equilateral Triangle ");
            } else {
                System.out.println("Triangle but not equilateral ");
            }

        } else {
            System.out.println("Not triangle");
        }


    }
}