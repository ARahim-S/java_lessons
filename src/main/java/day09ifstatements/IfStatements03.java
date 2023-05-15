package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Ornek : Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        // kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz..");
        char ch = input.next().charAt(0);


    }
}