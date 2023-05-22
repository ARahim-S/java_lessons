package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //Ornek: Verilen bir String de kucuk harfleri console a yazmayiniz
        // "Pwd12?Ab"  ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;
            } else {
                System.out.print(ch);
            }

        }

        //note :Break ile continue arasindaki fark nedir?
        //"break" ile switch parantezinin disina cikmak icin ve loop u kirmak icin kullanilir
        //continue ise loop yaparken bazi istenen elemanlari isleme sokmamak icin kullanilir
        //continue keywordu bir loop taki gecerli iteration i sonlandirip sizi increment/decrement parta goturur

    }
}

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