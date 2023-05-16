package selflearning;

public class PrintF03 {
    public static void main(String[] args) {

        String S1 = "Harun.xyz";

        byte sayi1 = 0;
        short sayi2 = 25;
        int sayi3 = 50;
        long sayi4 = 75;

        System.out.printf("%4$d \n" ,sayi1, sayi2, sayi3, sayi4);

        // Bu sayede 4. yani sonuncu verinin değerini getirip yazdırırız

    }
}
