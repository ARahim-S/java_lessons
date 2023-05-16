package selflearning;

public class PrintF02 {
    public static void main(String[] args) {


        String S1 = "Harun.xyz";

        byte sayi1 = 0;
        short sayi2 = 25;
        int sayi3 = 50;
        long sayi4 = 75;

        float sayi5 = 99.99f;
        double sayi6 = 149.99d;

        System.out.printf("%s  \n", S1);
        System.out.printf("%d %d %d %d \n", sayi1, sayi2, sayi3, sayi4);
        System.out.printf("%f %f  \n", sayi5, sayi6);

        // String biçimlemek için %s kullanılır
        // Tam Sayıları biçimlemek için %d kullanılır
        // Ondalıklı Sayıları biçimlemek için %f kullanılır
    }
}
