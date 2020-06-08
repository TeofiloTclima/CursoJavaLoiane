package Exerc15;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo terno da série de fibonacci:");
        int n = scan.nextInt();

        int primeiro =1;
        int segundo =1;
        int proximo;

        for (int i=3; i<=n; i++){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }

}
