package exercises;

public class ExercisesW3Resource {
    public static void main(String[] args){

        //Hello ARahim Soylu
        System.out.println(welcomeStructure("Hello", "ARahim", "Soylu"));
        //Good Afternoon
        System.out.println(welcomeStructure("Good Afternoon", "Ramazan", "Rahmi"));

        //2- Write a Java program to print the sum of two numbers
        System.out.println(sum(74,36));

        //3-Write a Java program to divide two numbers and print them on the scree
        System.out.println(divide(50,3));

        /*
        4 - Write a Java program to print the results of the following operations. Go to the editor
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
         */
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        // 6- Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

        System.out.println(subtract(125,24));
        System.out.println(modulus(125,24));

        // 7 - Write a Java program that takes a number as input and prints its multiplication table up to 10
        loop(10,8);



    }

    public static String welcomeStructure(String greeting, String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        String welcome = greeting + " " + fullName;
        return welcome;
    }

    //Sum Method
    public static int sum(int a, int b){
        return a+b;
    }

    //Divide Method
    public static int divide(int a , int b){
        return a/b;
    }

    //Subtract Method
    public static int subtract(int a, int b){
        return a-b;
    }

    //Modulus Method
    public static int modulus(int a, int b){
        return a % b;
    }

    public static void loop(int a,int b){
        int i;
        for(i =1; i <= a; i++){
          System.out.println(b + "*" + i + "=" + b*i );
        }

    }
}
