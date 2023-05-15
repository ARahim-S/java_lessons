package exercises;

import java.util.Scanner;

public class HackerRank {


    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            scan.nextLine();//buffer da yukarıdan kalan /n karakterini silmek için ekledim.
            String s = scan.nextLine();


            // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }

}
