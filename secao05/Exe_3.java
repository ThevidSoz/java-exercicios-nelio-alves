package java_exercicios_nelio_alves.secao05;

import java.util.Scanner;

public class Exe_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int numA = sc.nextInt();
        System.out.print("Digite o valor B: ");
        int numB = sc.nextInt();

        if (numA % numB == 0 || numB % numA == 0){
            System.out.printf("Os números %d e %d Sao Multiplos!", numA, numB);
        } else {
            System.out.printf("Os números %d e %d Nao Sao Multiplos!", numA, numB);
        }

        sc.close();
    }
}
