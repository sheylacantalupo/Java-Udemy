package uri_1115;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de x: ");
        int x = sc.nextInt();
        System.out.println("Valor de y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();


    }
}
