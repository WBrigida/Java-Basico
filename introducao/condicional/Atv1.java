package introducao.condicional;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x <= 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Não negativo");
        }

        sc.close();
    }

}
