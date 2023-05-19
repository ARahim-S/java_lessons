package task02;

import java.util.Scanner;

public class Q1Answer {

    /*
     TASK :
         Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
          dort islemden biri ile isleme koyup sonucun yazdiriniz

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Which math operation want to select?" +
                "Please select the number that you want" +
                "\n 1-Addition " +
                "\n 2-" +
                "Subtraction \n" +
                " 3-Multiplication " +
                "\n 4-Division ");

        int userSelectedOperation = input.nextInt();
        if(userSelectedOperation == 1){
            double result = firstNumber+secondNumber;
            System.out.println("result = " + result);
        } else if (userSelectedOperation == 2) {
            double result = firstNumber-secondNumber;
            System.out.println("result = " + result);
        } else if (userSelectedOperation == 3) {
            double result = firstNumber*secondNumber;
            System.out.println("result = " + result);
        }else if (userSelectedOperation == 4){
            double result = firstNumber/secondNumber;
            System.out.println("result = " + result);
        }else{
            System.out.println("Please try again...");
        }
    }
}
