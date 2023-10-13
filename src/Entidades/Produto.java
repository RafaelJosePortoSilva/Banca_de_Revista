package Entidades;

public class Produto {

    private int codigo;
    private String nome;
    private int estoque;
    private double valorUnitario;

    public abstract Produto(int codigo, String nome) {

        this.codigo = codigo;
        this.nome = nome;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    // Metodos

    public void incluirEstoque(int quantidade){
        estoque += quantidade;
    }

    public void tirarEstoque(int quantidade){
        if (quantidade <= estoque){
            estoque -= quantidade;
        } else{
            System.out.println("Estoque indisponível");
        }

    }
}
