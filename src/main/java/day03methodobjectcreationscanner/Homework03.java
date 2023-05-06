package day03methodobjectcreationscanner;

public class Homework03 {

        /*
    1)  Cemberin çevresini hesaplayan methodu oluşturunuz kullanınız
    2)  Dairenin alanını hesaplayn methodu oluşturunuz ve kullanınız.
     */


    public static void main(String[] args) {
        System.out.println("Circle Circumference = " + circumferenceCircle(10));
        System.out.println("Circle Area = " + circleArea(10));

    }

    //Answer 1 )
    public static double circumferenceCircle(double radius) {
        double pi = Math.PI;
        return 2 * pi * radius;
    }

    //Answer 2 )
    public static double circleArea(double radius) {
        double pi = Math.PI;
        return pi * radius * radius;
    }
}
