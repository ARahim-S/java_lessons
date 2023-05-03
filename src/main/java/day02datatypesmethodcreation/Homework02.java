package day02datatypesmethodcreation;

public class Homework02 {

        /*
        Homework02
        1)bir dikdörtgenin alanını hesaplayan methodu oluşturun ve kullanın
        2)dikdörtgenin çevresini hesaplayan methodu oluşturun ve kullanınız
         */
    public static void main(String[] args) {

        int resultRectangleArea = areaOfRectangle(3,5);
        System.out.println(resultRectangleArea);

        int resultRectanglePerimeter = perimeterOfRectangle(3,5);
        System.out.println(resultRectanglePerimeter);

    }

    //Answer 1 - Area of the rectangle

    public static int areaOfRectangle(int a, int b){
        return a*b;
    }

    //Answer 2 - Perimeter of the rectangle

    public static int perimeterOfRectangle(int a, int b){
        return (a+b) *2;
    }



}
