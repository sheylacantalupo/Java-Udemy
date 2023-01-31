package operadores_bitwise;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 32 = 00100000, declarando um número binário 0b00100000
        int mask = 32;
        int n = sc.nextInt();

        if((n & mask) != 0){
            System.out.println("O sexto bit é verdadeiro!");
        }
        else{
            System.out.println("O sexto bit é falso!");

        }

        sc.close();


    }
}
