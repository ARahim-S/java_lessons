package day07stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {
        /*

       Java'da String manipülasyonları:
       Bir String nesnesinin içeriğini değiştirmek, dönüştürmek veya işlemek için kullanılan yöntemler ve işlemlerdir.
       Aşağıda, Java'da kullanılan bazı temel String manipülasyonları ve anlamları açıklanmıştır:

        length(): Bir String'in karakter sayısını döndürür.
        Örnek: "Hello".length() çıktısı 5 olur.

        concat(String str): İki String'i birleştirir.
        Örnek: "Hello".concat(" World!") çıktısı "Hello World!" olur.

        toUpperCase(): Bir String'i tamamen büyük harflere dönüştürür.
        Örnek: "hello".toUpperCase() çıktısı "HELLO" olur.

        toLowerCase(): Bir String'i tamamen küçük harflere dönüştürür.
        Örnek: "HELLO".toLowerCase() çıktısı "hello" olur.

        charAt(int index): Belirtilen indeksteki karakteri döndürür.
        Örnek: "Hello".charAt(1) çıktısı 'e' olur.

        substring(int beginIndex): Belirtilen indeksten başlayarak String'in bir bölümünü alır.
        Örnek: "Hello World".substring(6) çıktısı "World" olur.

        substring(int beginIndex, int endIndex): Belirtilen başlangıç ve bitiş indeksleri arasındaki bir bölümüalır.
        Örnek: "Hello World".substring(0, 5) çıktısı "Hello" olur.

        indexOf(String str): Belirtilen alt dizenin başlangıç indeksini döndürür.
        Örnek: "Hello World".indexOf("World") çıktısı 6 olur.

        replace(char oldChar, char newChar): Bir karakterin tüm örneklerini başka bir karakterle değiştirir.
        Örnek: "Hello".replace('l', 'w') çıktısı "Hewwo" olur.

        split(String regex): Belirtilen bir düzenli ifadeye göre String'i parçalara böler ve bir dizi olarak döndürür.
        Örnek: "Hello World".split(" ") çıktısı ["Hello", "World"] olur.

        trim(): String'in başındaki ve sonundaki boşlukları kaldırır.
        Örnek: " Hello ".trim() çıktısı "Hello" olur.

        Bu, Java'da sık kullanılan bazı String manipülasyonlarının örnekleridir.
        Java'da String sınıfı birçok başka yönteme de sahiptir ve bu yöntemler,
        String manipülasyonları için güçlü bir araç seti sağlar.

         */

        /*
        Java'da kullanılan bazı meşhur regex (düzenli ifade) örnekleri aşağıda listelenmiştir:

        \\d: Rakamları eşleştirir.
        Örneğin, "123" ifadesi \d ile eşleşir.

        \\D: Rakam olmayan karakterleri eşleştirir.
        Örneğin, "abc" ifadesi \D ile eşleşir.

        \\w: Harf veya rakamları eşleştirir.
        Örneğin, "a1b2c3" ifadesi \w ile eşleşir.

        \\W: Harf veya rakam olmayan karakterleri eşleştirir.
        Örneğin, "!@#$" ifadesi \W ile eşleşir.

        \\s: Boşluk karakterlerini eşleştirir.
        Örneğin, "Hello World" ifadesi \s ile eşleşir.

        \\S: Boşluk olmayan karakterleri eşleştirir.
        Örneğin, "HelloWorld" ifadesi \S ile eşleşir.

        .: Herhangi bir karakteri eşleştirir (Yeni satır karakteri hariç).
        Örneğin, "abc" ifadesi . ile eşleşir.

        *: Önceki ifadenin sıfır veya daha fazla tekrarını eşleştirir.
        Örneğin, "aaa" ifadesi a* ile eşleşir.

        +: Önceki ifadenin bir veya daha fazla tekrarını eşleştirir.
        Örneğin, "aaa" ifadesi a+ ile eşleşir.

        ?: Önceki ifadenin sıfır veya bir kez tekrarını eşleştirir.
        Örneğin, "ab" ifadesi ab? ile eşleşir.

        []: Karakter kümesini eşleştirir.
        Örneğin, "a" veya "b" ifadeleri [ab] ile eşleşir.

        [^]: Karakter kümesinin dışındaki karakterleri eşleştirir.
        Örneğin, "c" ifadesi [^ab] ile eşleşir.

        \\b: Kelime sınırlarını eşleştirir.
        Örneğin, "Hello" ifadesi \\bHello\\b ile eşleşir.

        \\A: Girişin başını eşleştirir.
        Örneğin, "Hello" ifadesi \\AHello ile eşleşir.

        \\z: Girişin sonunu eşleştirir.
        Örneğin, "World" ifadesi World\\z ile eşleşir.

        Bu, Java'da yaygın olarak kullanılan bazı regex örnekleridir.
        Regex, metin işleme ve arama/geliştirme alanlarında güçlü bir araçtır
         */

    }
}
