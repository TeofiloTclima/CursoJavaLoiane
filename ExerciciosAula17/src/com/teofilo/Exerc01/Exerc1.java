package com.teofilo.Exerc01;

import java.util.Scanner;
public class Exerc1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do{

            System.out.println("Entre com uma nota");

            double nota = scan.nextDouble();

                if (nota >=0 &&  nota <=10){
                    notaValida = true;
                System.out.println("Você digitou: " + nota);
                }else{
                System.out.println("nota inválida, digite novamente.");
                }
        }while(! notaValida);


    }

}
