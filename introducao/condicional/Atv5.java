package introducao.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qte = sc.nextInt();
        double total;

        if (cod == 1) {
            total = qte * 4.00;
        } else if (cod == 2) {
            total = qte * 4.50;
        } else if (cod == 3) {
            total = qte * 5.00;
        } else if (cod == 4) {
            total = qte * 2.00;
        } else {
            total = qte * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }

}
