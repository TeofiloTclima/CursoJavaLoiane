package com.teofilo.Exerc2;
import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;

        do {
            System.out.println("Digite o nome do usuário");
            String nomeUser = scan.next();

            System.out.println("Entre com a senha");
            String senha = scan.next();

            if (nomeUser.equalsIgnoreCase(senha)) {
                //infoValidas = false;
                System.out.println("Senha igual a usuário, digite novamente.");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuário válido");
            }
        } while (!infoValidas);
    }
}
