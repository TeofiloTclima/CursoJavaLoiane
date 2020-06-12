package com.teofilo.Exerc08;
import java.util.Scanner;

    //  Faça um programa que leia 5 números e informe a soma e a média dos numeros

public class Exerc8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num;
        double media;
        int soma =0;

        for (int i=0; i<5; i++){
            System.out.println("Digite um Número");
            num = scan.nextInt();

            soma += num;
        }

        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média " + media);
    }
}

