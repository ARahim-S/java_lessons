package task02;

import java.util.Scanner;

public class Q2Answer {
    /*
    Q02
        TASK :
         Kullanicidan 3 tene pozitif  tam sayi alniz.
         bu uc sayinin ucgen olusturma durumunu kontrol ediniz
         eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
         INFO :
         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
         herhangi iki kenar farkı diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
        a=b=c ise es kenar ucgen
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 positive numbers...");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean checkPositive = a < 0 || b < 0 || c < 0;
        boolean checkTriangle1 = a + b > c && a - b < c;
        boolean checkTriangle2 = a + c > b && a - c < b;
        boolean checkTriangle3 = b + c > a && b - c < a;

        if (checkPositive) {
            System.out.println("Please enter positive number");
        } else if (checkTriangle1 && checkTriangle2 && checkTriangle3) {
            if (a == b && b == c && a == c) {
                System.out.println("This is a triangle and equilateral triangle");
            } else {
                System.out.println("This is a triangle but not a equilateral triangle");
            }

        } else {
            System.out.println("This is not a triangle...");
        }
    }
}