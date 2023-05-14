package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework08 {
    /*Homework
    1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

     */
    public static void main(String[] args) {

        String homework = "Hello1578_?What's up";

        //Answer 1)
        int manipulatedHomeWorkLength = homework.replaceAll("[0-9]", "").length();
        System.out.println("manipulatedHomeWorkLength = " + manipulatedHomeWorkLength);

        //Answer 2)
        int lastCharacterIndex = homework.length() - 1;
        String uHoExcFirstLast = homework.substring(1, lastCharacterIndex).toUpperCase();
        System.out.println("First and Last Character Except = " + uHoExcFirstLast);

        //Answer 3)

        char firstCase = homework.charAt(0);
        char lastCase = homework.charAt(lastCharacterIndex);
        System.out.println(firstCase + lastCase);

        //Answer 4)
        String cityName = "bErLin";
        String cityLowerCase = cityName.toLowerCase();
        String firstLetter = cityLowerCase.substring(0, 1).toUpperCase();
        String otherLetters = cityLowerCase.substring(1);
        String manipulated = firstLetter + otherLetters;
        System.out.println("manipulated = " + manipulated);

        /*
        5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

         */
        //Answer 5)
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen password giriniz!");
        String password = input.nextLine();

        //a)
        boolean firstCondition = password.length() > 6;
        System.out.println("firstCondition = " + firstCondition);

        //b)
        String isUpper = password.replaceAll("[^A-Z]", "");
        System.out.println("isUpper = " + isUpper);
        boolean secondCondition = isUpper.length() > 0;
        System.out.println("secondCondition = " + secondCondition);

        //c)
        String isLower = password.replaceAll("[^a-z]", "");
        boolean thirdCondition = isLower.length() > 0;
        System.out.println("thirdCondition = " + thirdCondition);

        //d)
        String isNumberContain = password.replaceAll("[^0-9]", "");
        boolean fourthCondition = isNumberContain.length() > 0;
        System.out.println("fourthCondition = " + fourthCondition);

        boolean isCorrectPassword = firstCondition && secondCondition && thirdCondition && fourthCondition;
        System.out.println("isCorrectPassword = " + isCorrectPassword);


    }
}
