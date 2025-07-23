package models;

public class Produto {

    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto ()
    {

    }

    public Produto (String nome, String descricao, double preco, int quantidade)
    {

        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome()
    {
        return nome;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public double getPreco()
    {
        return preco;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public String exibirInformacoes()
    {
        return  "Nome: " + nome +
                "\nDescrição: " + descricao +
                "\nPreço: R$ " + preco +
                "\nQuantidade: " + quantidade;
    }

    @Override
    public String toString()
    {
        return exibirInformacoes();
    }
}