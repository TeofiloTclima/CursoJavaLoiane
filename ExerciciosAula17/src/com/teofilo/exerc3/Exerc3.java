package com.teofilo.exerc3;
import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do{
            System.out.println("Entre com o nome:");
            nome = scan.next();

            if (nome.length() >3){
                    infoValida =true;
            }else {
                    System.out.println("Nome precisa ter no mínimo 3 caracteres.");
            }
        }while (!infoValida);

        boolean infovalida = false;
        do{
            System.out.println("Entre com a idade:");
            idade = scan.nextInt();

            if (idade >= 0 && idade <=150){
                    infoValida =true;
            }else {
                    System.out.println("Idade precisa ser entre 0 e 150..");
            }
        }while (!infoValida);

         infovalida = false;
        do{
            System.out.println("Entre com a idade:");
            salario = scan.nextDouble();

            if (salario > 0 ){
                infoValida =true;
            }else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        }while (!infoValida);

        infovalida = false;
        do{
            System.out.println("Entre com o sexo:");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                infoValida =true;
            }else {
                System.out.println("Sexo precisa ser 'f' para Feminino ou 'm' para masculino.");
            }
        }while (!infoValida);

        infovalida = false;
        do{
            System.out.println("Entre com a idade:");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c")||
                    estadoCivil.equalsIgnoreCase("v")||
                    estadoCivil.equalsIgnoreCase("d")){
                infoValida =true;
            }else {
                System.out.println("Estado Civil precisa ser 's' solteiro, 'c' casado, 'v' viuvo e 'd' para divorciado:");
            }
        }while (!infoValida);

        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);



    }

}
