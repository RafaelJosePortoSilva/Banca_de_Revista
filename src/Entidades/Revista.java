package Entidades;

public class Revista extends Produto{

    private String editora;

    public Revista(int codigo,String nome, String editora){
        super(codigo,nome);
        this.editora = editora;
    }

}
