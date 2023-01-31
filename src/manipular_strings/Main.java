package manipular_strings;

public class Main {
    public static void main(String[] args){
        String original = "abcde FGHI ABC abc DEFG    ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2,9);
        String s6 = original.replace('a', 'x');
        String s7 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: " + original);
        System.out.println("toLowerCase: " + s1);
        System.out.println("toUpperCase: " + s2);
        System.out.println("trim: " + s3);
        System.out.println("substring (2): " + s4);
        System.out.println("substring (2,9): " + s5);
        System.out.println("replace ('a','x'): " + s6);
        System.out.println("replace (abc,xy): " + s7);
        System.out.println("indexOf bc: " + i);
        System.out.println("lastIndexOf bc: " + j);

        // Operação split
        String s = "potato apple lemon";
        // está usando o espaço em branco como separador
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);





    }
}
