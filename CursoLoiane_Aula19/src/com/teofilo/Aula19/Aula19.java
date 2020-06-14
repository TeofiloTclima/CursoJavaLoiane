package com.teofilo.Aula19;
public class Aula19 {
    public static void main(String[] args) {

        /*double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;*/

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        // como imprimir uma informação dentro do Array
        System.out.println("O valor da temperatura do dia 1 é " + temperaturas[0]);
        // como mostrar a quantidade de informações dentro do array
        System.out.println("O tamanho do array: " + temperaturas.length);
        // como imprimir valores do array
        System.out.println("Valores do array: " );

        for (int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da dtemperatura do dia " + (i+1) + " é " + temperaturas[i]);
        }
        // for melhorado utilizado em arrays.
        for (double temp : temperaturas){
            System.out.println(temp);
        }

    }
}