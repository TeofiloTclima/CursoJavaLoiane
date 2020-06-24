package Exerc11;

    //  Criar um vetor A com 10 elementos inteiros. Implementar um programa
    //  que defina e escreva a quantidade de elementos armazenados neste
    //  vetor que são pares.

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }

        int qtdPares =0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                qtdPares++;
            }
        }
        System.out.println();

        System.out.println("Qtd números pares " + qtdPares);
    }
}
