package com.teofilo.Exerc13;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a base:");
        int base = scan.nextInt();

        System.out.println("Entre com a potência:");
        int pot = scan.nextInt();

        int result = base;

        for(int i=1; i<pot; i++) {
            result *= base;

         System.out.println("Resultado: " + result);
        }

    }
}
