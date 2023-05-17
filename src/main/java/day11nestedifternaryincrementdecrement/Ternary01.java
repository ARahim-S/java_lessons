package day11nestedifternaryincrementdecrement;

public class Ternary01 {
    public static void main(String[] args) {
        //Ternary Statement
        //You should use ternary operator instead of if-else condition if possible.

        //Ornek1: Sayi 10 dan kucuk ise console a "kucuk" yazdirin degil ise "kucuk degil" yazdirin
        //----------if else cozumu-------

        int num = 13;

        if (num < 10) {
            System.out.println("Kucuk");
        } else {
            System.out.println("Kucuk degil");
        }

        //---------ternary cozumu----------
        //Condition  ?   Condition true ise calisir  : Condition false ise calisir ;
        String sonuc = num < 10 ?               "Kucuk"         :       "Buyuk"               ;
        System.out.println(sonuc);

        //Ornek 2 Sayi cift ise console a "cift" , tek ise "Tek" yazdirin


    }
}

