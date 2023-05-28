package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        String strNames[] = new String[5];
        strNames[0] = "ahmet";
        strNames[1] = "mehmet";
        strNames[2] = "hasan";
        strNames[3] = "kartal";
        strNames[4] = "aliosman";
        System.out.println(Arrays.toString(strNames));

        //First way
        System.out.println(strNames[0].length() + strNames[strNames.length - 1].length());

        //Second way
        int result = 0;
        for (int i = 0; i < strNames.length; i++) {
            if (i == 0 || i == strNames.length - 1) {
                result += strNames[i].length();
            }
        }
        System.out.println(result);

        //Ornek 2: String bir array olusturun, icine 5 tane eleman ekleyin,
        // tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin

        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Ankara";
        brr[3] = "Oslo";
        brr[4] = "Erzurum";
        System.out.println(Arrays.toString(brr));


        //1 yol for loop

        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);

        //2. yol for each loop (enhanced loop)
        //baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder.
        // for-each-loop "Array" lerde ve "collection" larda kullanilir
        /*
        kalibini olusturalim
        for(DataType  w: arr/collection ){
            calisacak kodlar
        }
        */

        int sum = 0;

        for (String w : brr) {
            sum = sum + w.length();
        }
        System.out.println(sum);//30


        //Ornek 3 Notlar adinda Integer bir array olusturunuz icine 6 tane not yerlestiniz ve not ortalamasini ekrana yazdiriniz

        int notlar[] = new int[6];
        notlar[0] = 50;
        notlar[1] = 70;
        notlar[2] = 60;
        notlar[3] = 40;
        notlar[4] = 90;
        notlar[5] = 80;

        System.out.println(Arrays.toString(notlar));//[50, 70, 60, 40, 90, 80]


        int toplam = 0;
        //[50, 70, 60, 40, 90, 80]
        for (int w : notlar) {

            toplam = toplam + w;

        }
        System.out.println(toplam / notlar.length);

        //Array yada collection ile çalışıyorsanız ilk tercihiniz for each loop (enchanced loop) olmalıdır.

    }
}
