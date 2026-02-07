package java_exercicios_nelio_alves.secao05;

import java.util.Scanner;

public class Exe_1 {
    public static void main(String[] args) {
        
        System.out.print("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        int numInput = sc.nextInt();

        if (numInput < 0) {
            System.out.printf("O número %d é negativo!", numInput);
        } else {
            System.out.printf("O número %d é positivo!", numInput);
        }

        sc.close();
    }
}