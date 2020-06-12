package com.teofilo.Exerc21;
import java.util.Scanner;

    //  Faça um programa que calcule o número médio de alunos por turma.
    //  Para isto, peça a quantidade de turmas e a quantidade de alunos para
    //  cada turma. As turmas não podem ter mais de 40 alunos.

public class Exerc21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero de turmas");
        int nTurmas = scan.nextInt();

        int nAlunos;
        int soma = 0;
        boolean invalido = false;

        for (int i=1; i<=nTurmas; i++){
            invalido = true;

            do {
                System.out.println("Entre com o numero de alunos da turma " + i);
                nAlunos = scan.nextInt();

                if (nAlunos >= 40) {
                    invalido = false;
                }else{
                    System.out.println("Númeor de alunos inválidos. Digite novamente");
                }

            }while (invalido);

            soma += nAlunos;
        }
            double media = soma / nTurmas;

            System.out.println("Média " + media);
    }

}
