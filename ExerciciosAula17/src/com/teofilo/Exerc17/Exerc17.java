package com.teofilo.Exerc17;

import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scan.nextInt();

        System.out.print(num + "! = ");

        int fatorial = 1;
        for (int i=num; i>0; i--){
            fatorial *= i;
            System.out.println(i);

        }
        System.out.println("Resultato: " + fatorial);
    }

}
