package Introducao.sequencial;

import java.util.Scanner;

public class At1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = x + y;

        System.out.println("Soma = " + soma);

        sc.close();
    }

}
