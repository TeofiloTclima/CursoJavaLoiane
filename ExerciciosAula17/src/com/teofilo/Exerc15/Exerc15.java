package Exerc15;
import java.util.Scanner;

    // A série de fibonavvi é formada pela sequência 1,1,2,3,5,8,13,21,34,55,...
    // Faça um programa capaz de gerar a série até o n−ésimo termo.


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
