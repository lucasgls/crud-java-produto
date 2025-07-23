    package Service;

    import models.Produto;

    import java.util.ArrayList;

    public class ProdutoService
    {

        ArrayList<Produto> produtos = new ArrayList<>();

        public void cadastraProduto(String nome, String descricao, double preco, int quantidade)
        {
            Produto prod = new Produto(nome,descricao,preco,quantidade);
            produtos.add(prod);
        }

        public void listarProdutos()
        {
            System.out.println("Lista de Produtos Cadastrados:");

            for (Produto p : produtos)
            {
                System.out.println("------------------------------");
                System.out.println(p);
            }
            System.out.println("------------------------------");
        }

        public void buscaProduto(String nome)
        {
            boolean statusBuscaDoProduto = false;

            for(Produto p : produtos)
            {
                System.out.println("Buscando Produto com Nome: " + p.getNome() );

                if(p.getNome().equalsIgnoreCase(nome.trim()))
                {
                    statusBuscaDoProduto = true;

                    System.out.println("Produto Encontrado!");
                    System.out.println("\n" + p.exibirInformacoes());
                }
            }
            if(!statusBuscaDoProduto)
                System.out.println("Produto não Encontrado.");
        }

        public void atualizaProduto(String nome, String novoNome, String novaDescricao, double novoPreco, int novaQuantidade)
        {
            boolean statusBuscaDoProduto = false;

            for(Produto p : produtos)
            {
                if(p.getNome().equals(nome))
                {
                    statusBuscaDoProduto = true;

                    p.setNome(novoNome);
                    p.setDescricao(novaDescricao);
                    p.setPreco(novoPreco);
                    p.setQuantidade(novaQuantidade);

                    System.out.println("Produto Atualizado com Sucesso");

                    System.out.println(p.exibirInformacoes());
                }
            }
            if(!statusBuscaDoProduto)
                System.out.println("Produto não Encontrado.");
        }

        public void removeProduto(String nome)
        {
            boolean statusBuscaDoProduto = false;

            for(Produto p : produtos)
            {
                if(p.getNome().equals(nome))
                {
                    statusBuscaDoProduto = true;

                    produtos.remove(p);

                    System.out.println(p);
                    System.out.println("\nProduto (" + p.getNome() + ") Removido com Sucesso!");

                    break;
                }
            }
            if(!statusBuscaDoProduto)
                System.out.println("Produto não Encontrado.");
        }
    }
