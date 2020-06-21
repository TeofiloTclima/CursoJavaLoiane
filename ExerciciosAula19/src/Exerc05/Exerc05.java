package Exerc05;
import java.text.DecimalFormat;
import java.util.Scanner;

    //  Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
    //  mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
    //  ser o respectivo elemento de A multiplicado por sua posição (ou
    //  índice), ou seja:
    //  B[i] = A[i] * i.

public class Exerc05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[10];
        int vetorB[] = new int [vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;


        }
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length;i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }
        System.out.println();

    }

}
