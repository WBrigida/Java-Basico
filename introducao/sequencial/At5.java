package Introducao.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class At5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int num1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double total = num1 * valor1 + num2 * valor2;

        System.out.println("Codigo do produto 1: " + cod1);
        System.out.println("Codigo do produto 2: " + cod2);
        System.out.printf("VALOR A PAGAR: %.2f%n", total);

        sc.close();
    }

}
