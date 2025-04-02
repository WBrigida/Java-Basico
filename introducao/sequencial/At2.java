package Introducao.sequencial;

import java.util.Scanner;
import java.util.Locale;

public class At2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * r * r;

        System.out.printf("Area = %.4f%n", area);

        sc.close();
    }

}
