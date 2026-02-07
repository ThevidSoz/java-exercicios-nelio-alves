package java_exercicios_nelio_alves.secao05;

import java.util.Scanner;

public class Exe_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numInput = sc.nextInt();

        if (numInput % 2 == 0) {
            System.out.printf("O número %d é PAR!", numInput);
        } else {
            System.out.printf("O número %d é IMPAR!", numInput);
        }

        sc.close();
    }
}
