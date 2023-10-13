package Aplicacao;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int escolha;
        Boolean ativa;

        System.out.println("" +
                "Bem vindo(a) à Banca.\n" +
                "Escolha ums das operações abaixo:\n" +
                "\n" +
                "[1] Consultar estoque\n" +
                "[2] Adicionar produto\n" +
                "[3] Operar estoque");
        ativa = true;
        while(true) {
            try {
                escolha = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite um número");
                ativa = false;
            }
            if(ativa){break;}
        }



    }

}
