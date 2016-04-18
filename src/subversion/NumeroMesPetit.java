package subversion;

import java.util.Scanner;

/**
 *
 * @author Roger Lera
 * @version Abril 2016
 */
public class NumeroMesPetit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int count = 0;
        int aux = Integer.MAX_VALUE;
        System.out.println("Donem 5 números: ");
        while (count < 5) {
            num = sc.nextInt();
            if (aux > num) {
                aux = num;
            }
            count++;
        }
        System.out.println("El número més petit és: " + aux);
    }
}
