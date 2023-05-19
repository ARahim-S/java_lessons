package task02;

import java.util.Scanner;

public class Q5Answer {

    /*
    Q05

        TASK :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int userAge = input.nextInt();
        System.out.println("How weigt are you?");
        int userWight = input.nextInt();

        if (userAge < 18 && userAge > 0) {
            System.out.println("You can not donate blood");
        } else if (userAge > 18 && userWight < 50 && userWight > 0) {
            System.out.println("You can not donate blood");
        } else if (userAge > 18 && userWight > 50) {
            System.out.println("You can donate blood");
        } else {
            System.out.println("Something went wrong....");
        }
    }
}
