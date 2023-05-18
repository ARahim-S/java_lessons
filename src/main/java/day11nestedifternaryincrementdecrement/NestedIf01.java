package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

        /*
           Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

           Eger calisan kadin ise;
            60 yasindan buyukse "Emekli Olabilir "yazdirin

           Eger calisan erkek ise;
            65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender..");
        String gender = input.next();

        System.out.println("please enter your age..");
        int age = input.nextInt();

        if(age<0 || age >120){

            System.out.println("Please enter age between 0 and 120");

        }else if(gender.equalsIgnoreCase("woman")){

            if(age>60){
                System.out.println("can retire");
            }else{
                System.out.println("should work more...");
            }

        } else if (gender.equalsIgnoreCase("Erkek")) {

            if(age>65){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Kesinlikle calismali..");
            }

        }else{
            System.out.println("Tanimli degil...");
        }

    }
}