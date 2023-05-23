package day13loops;

import java.util.Scanner;

public class Homework {


    /*
    soru1:  // 41 kere maşallah print ediniz
    soru2: girilen sayıdan 100e kadar 4 ün katı olan tam sayıları print eden kod yazınız
    soru3:  100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13

         soru4: Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
       ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
       hesaplayan kodu yazın
      Örnek Ekran Çıktısı
      Girilen sayı=4
      Kareler toplamı=14

     */
    public static void main(String[] args) {
        //Soru - 41 kere maşallah print ediniz
        //Answer - 1
        for (int i = 0; i < 42; i++) {
            System.out.println(i + " : Maşallah");
        }

        //Soru - girilen sayıdan 100e kadar 4 ün katı olan tam sayıları print eden kod yazınız
        //Answer - 2
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int userInput = input.nextInt();

        for (int i = userInput; i < 100; i++) {
            int multiply4 = i * 4;
            if (multiply4 == 0) {
                continue;
            } else {
                System.out.println(multiply4);
            }

        }

        /*
            soru3:  100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13
         */

        //Answer - 3
        int total = 0;
        for (int i = 40; i > 0; i--) {
            if (i % 13 == 0) {
                total += i;
                System.out.println(i);
            }
        }
        System.out.println(total);

        /*
       soru4: Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
       ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
       hesaplayan kodu yazın
        Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=14
         */
        //Answer 4
        System.out.println("Lütfen 1 den büyük bir tamsayı giriniz..");
        int userInputInt = input.nextInt();
        int totalMultiplyResult = 0;
        for (int i = 0; i < userInputInt; i++) {
            totalMultiplyResult += i * i;
        }
        System.out.println("totalMultiplyResult = " + totalMultiplyResult);
    }
}
