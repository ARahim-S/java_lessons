package stringquestions;

public class StringAnswers {
    public static void main(String[] args) {
        String str = "New York";
        System.out.println(str.length());

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String str2 = "How are you?";
        String manipulatedStr2 = str2.replace("are", "well");
        System.out.println(manipulatedStr2);//How well you?

        String manipulatedStr3 = str2.replaceAll(" ", "");
        System.out.println(manipulatedStr3); //Howareyou?



    }
}
