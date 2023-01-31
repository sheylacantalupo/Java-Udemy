package uri_1114;
import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while(senha != 2002){

            System.out.println("Insira uma senha válida: ");
            senha = sc.nextInt();


        }

        System.out.println("Acesso permitido");



    }


}
