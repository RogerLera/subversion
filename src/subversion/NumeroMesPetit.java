package subversion;

import java.util.Scanner;

/**
 * Classe NumeroMesPetit, creada per projecte2.
 *
 * @author Roger Lera
 * @version Abril 2016
 */
public class NumeroMesPetit {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        System.out.println("Donem 5 números: ");
        // Bucle que es recorre 10 vegades.
        while (count < 10) {
            num = sc.nextInt();
            // Comprovem si el número rebut és més petit que el min.
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
            count++;
        }
        System.out.println("El número més petit és: " + min);
        System.out.println("El número més gran és: " + max);
    }
}
