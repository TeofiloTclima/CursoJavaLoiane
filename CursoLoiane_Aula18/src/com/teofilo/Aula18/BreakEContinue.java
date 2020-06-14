package com.teofilo.Aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i =num; i< max; i++){

            if (i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
    }
}
