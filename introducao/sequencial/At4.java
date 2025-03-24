package introducao.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class At4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = horas * valorHora;

        System.out.println("NUMBER = " + num);
        System.out.printf("Salary = $%.2f%n", salario);

        sc.close();
    }

}
