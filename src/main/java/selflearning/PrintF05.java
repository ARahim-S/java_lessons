package selflearning;

public class PrintF05 {
    public static void main(String[] args) {

        float hesabimdakiMiktar = 1450f;

        System.out.printf("%,f\n" ,hesabimdakiMiktar);

        // Sayıyı binliklere ayrır yalnız yanına 6 sıfır koyar
        // 1,450.000000

        System.out.printf("%,.2f\n" ,hesabimdakiMiktar);

        // Sayıyı binliklere ayırır 2 sıfır koyar
        //1,450.00

    }
}
