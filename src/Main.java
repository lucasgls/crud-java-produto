    import Service.ProdutoService;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args)
        {
            ProdutoService produtoService = new ProdutoService();
            Scanner scan = new Scanner(System.in);

            int opcao = 0;

            while (opcao != 99)
            {
                System.out.println("\n");
                System.out.println("+--------------------------------------+");
                System.out.println("|                 MENU                 |");
                System.out.println("+--------------------------------------+");
                System.out.println(
                                "| 01 - Cadastrar Produto               |\n" +
                                "| 02 - Listar Produtos                 |\n" +
                                "| 03 - Bucar Produto Por Nome          |\n" +
                                "| 04 - Atualizar Produto               |\n" +
                                "| 05 - Remover Produto                 |\n" +
                                "| 99 - Sair                            |"
                );
                System.out.println("+--------------------------------------+\n\n");

                opcao = scan.nextInt();
                scan.nextLine();

                switch (opcao)
                {
                    case 1:
                        System.out.println("Escreva os dados do Produto -> \n ");

                        System.out.print("Nome: ");
                        String nome = scan.nextLine();

                        System.out.print("Descrição: ");
                        String descricao = scan.nextLine();

                        System.out.print("Preço: ");
                        double preco  = scan.nextDouble();
                        scan.nextLine();

                        System.out.print("Quantidade: ");
                        int quantidade = scan.nextInt();
                        scan.nextLine();

                        produtoService.cadastraProduto(nome, descricao, preco, quantidade);

                        break;

                    case 2:
                        produtoService.listarProdutos();

                        break;

                    case 3:
                        System.out.print("Nome do Produto: ");
                        String nomeBusca = scan.nextLine();

                        produtoService.buscaProduto(nomeBusca);

                        break;

                    case 4:
                        System.out.print("Nome do Produto: ");
                        String nomeAtualizar = scan.nextLine();

                        System.out.println("Escreva os NOVOS dados do Produto -> \n ");

                        System.out.print("Nome: ");
                        String novoNome = scan.nextLine();

                        System.out.print("Descrição: ");
                        String novaDescricao = scan.nextLine();

                        System.out.print("Preço: ");
                        double novoPreco  = scan.nextDouble();
                        scan.nextLine();

                        System.out.print("Quantidade: ");
                        int novaQuantidade = scan.nextInt();
                        scan.nextLine();

                        produtoService.atualizaProduto(nomeAtualizar, novoNome, novaDescricao, novoPreco, novaQuantidade);

                        break;

                    case 5:
                        System.out.print("Nome do Produto: ");
                        String nomeDeletar = scan.nextLine();

                        produtoService.removeProduto(nomeDeletar);

                        break;

                    case 99:
                        System.out.println("Saindo...");

                        break;

                    default:
                        System.out.println("Erro ao Inserir Menu ou Número não Existe");

                        break;
                }
            }
        }
    }