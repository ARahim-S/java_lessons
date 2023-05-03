package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
        Java'da method nasıl oluşturulur?
        1) main methodun dışında classın içinde oluşturulur.
        2) Access Modifier + Return Type + Method Name + () + {}
   */

    /*
    Oluşturulan methodlar nasıl kullanılır?
    1) Methodu oluşturmak methodu çalıştırmak için yeterli değildir.
    Kullanılmak istenen method
    main method un içinden kullanılır
    2)Method Name + () yazın.
    3)Varsa işlem yapacağınız dataları parantezin içine koyun.
    bu işlem method call (method çağırma) olarak adlandırılır.
    4)method name + parametreler ==> method signature
     */
    public static void main(String[] args){

        //Ornek 1
        int result = sum(3,6);
        System.out.println(result);

        //Ornek 2
        long multiplyResult = multiply(158,895);
        System.out.println(multiplyResult);

        //Ornek 3
        System.out.println(firstMultiplyThenAdd(3,5,10));

    }

    //Ornek 1 : toplama işlemi yapan bir method oluşturunuz
    public static int sum(int a, int b){
        /*
        bu kısımda method kapsamında kullanılmasını
        ve işlenmesini istediğim dataları deklare ediyoruz
         */
        return a+b;
        //Return demek bu methodun çağrıldığı yere bu değeri return et demek.
    }

    /*
    Main method static olduğu için
    main method içinde kullanacağımız method static olmalıdır.
     */

    //Ornek 2 : 2 sayıyı çarpma işlemi yapan bir method oluşturunuz

    protected static long multiply(int a,int b){
        return a*b;
    }

    //Ornek 3 Verilen 3 sayıdan ilk iksiini çarpan üçüncüsünü toplayan bir method yazın

    private static int firstMultiplyThenAdd(int a, int b, int c){
        return a*b+c;
    }

    /*
    Homework02
    1)bir dikdörtgenin alanını hesaplayan methodu oluşturun ve kullanın
    2)dikdörtgenin çevresini hesaplayan methodu oluşturun ve kullanınız
     */
 }
