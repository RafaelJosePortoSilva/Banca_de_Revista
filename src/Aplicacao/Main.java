package Aplicacao;
import Entidades.Bebida;
import Entidades.Revista;
import Entidades.Doce;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int escolha;
        boolean ativa;

        Revista revista = new Revista(1,"Ciencias","Recreio");
        Bebida bebida = new Bebida(2,"Tubaina","Refrigerante");
        Doce doce = new Doce(3,"Bala","7Belo");

        System.out.println("" +
                "Bem vindo(a) à Banca.\n" +
                "Escolha ums das operações abaixo:\n" +
                "\n" +
                "[1] Consultar estoque\n" +
                "[2] Adicionar produto\n" +
                "[3] Operar estoque");

        while(true) {
            ativa = true;
            escolha = sc.nextInt();

            if(ativa) {
                switch (escolha) {
                    case 1:
                        consultarEstoque(revista,bebida,doce);
                        break;
                    case 2:
                        adicionarProduto(revista,bebida,doce);
                        break;
                    case 3:
                        operarEstoque(revista,bebida,doce);
                        break;
                    default:
                        System.out.println("Opção indisponível.");
                        ativa = false;
                } // end switch escolha
            } // end if ativa
            if(ativa){break;}
        } // end while

    }

    public static void consultarEstoque(Revista revista, Bebida bebida, Doce doce){

        Scanner sc = new Scanner(System.in);
        int escolha;
        boolean ativa;
        int print = 0;

        System.out.println("" +
                "Escolha o tipo de produto:" +
                "[1] Revistas" +
                "[2] Bebidas" +
                "[3] Doces");


        while(true) {
            ativa = true;
            escolha = sc.nextInt();

            if(ativa) {
                switch (escolha) {

                    case 1:
                        System.out.println( revista.getEstoque());
                        break;
                    case 2:
                        System.out.println( bebida.getEstoque());
                        break;
                    case 3:
                        System.out.println( doce.getEstoque());
                        break;
                    default:
                        System.out.println("Opção indisponível.");
                        ativa = false;
                } // end switch escolha
            } // end if ativa
            if(ativa){break;}
        } // end while




    }

    public static void adicionarProduto(Revista revista, Bebida bebida, Doce doce){

    }

    public static void operarEstoque(Revista revista, Bebida bebida, Doce doce){

    }


}
