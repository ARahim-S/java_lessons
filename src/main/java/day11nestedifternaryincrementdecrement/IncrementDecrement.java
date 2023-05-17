package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {

        /*
        h** h// çarpma ve bölme yoktur. çünkü bir sayının bir ile çarpımı
        ve bölümü yine kendisidir.
         */


        //Increment
        int a = 5;
        System.out.println(a);//5

        a = a + 2;
        System.out.println(a);//7

        a += 2;
        System.out.println(a);//9

        //Ornek : Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.
        int b = 10;
        System.out.println(b);//10

        b = b + 5;
        System.out.println(b);//15

        b += 5;
        System.out.println(b);//20

        //Decrement
        int c = 8;
        System.out.println(c);//8

        c = c - 3;
        System.out.println(c);//5

        c -= 3;
        System.out.println(c);//2

        //Increment 2
        int d = 6;
        System.out.println(d);//6

        d = d * 2;
        System.out.println(d);//12

        d *= 2;
        System.out.println(d);//24


        //Decrement 2

        int e = 24;
        System.out.println(e);//24

        e = e / 2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6

        //"1" ile increment

        int f = 12;
        //f=f+1;
        //f+=1;
        f++;

        //"1" ile decrement

        int h = 10;
        // h=h-1;
        //h-=1;
        h--;


    }
}