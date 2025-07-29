package Pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar {
    
    static int proximoId = 1;
    static ArrayList<Main> produtos = new ArrayList<>();

    
        public static void servico1(Scanner teclado) {
        System.out.println("Olá, Bem-vindo!");
        System.out.print("Quantas ferramentas deseja cadastrar? ");
        int quantidade = teclado.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Cadastro da ferramenta #" + (i + 1));
            System.out.print("Tipo (1 = Manual, 2 = Elétrica): ");
            int tipo = teclado.nextInt();
            teclado.nextLine(); 

            System.out.print("Nome da ferramenta: ");
            String nome = teclado.nextLine();

            System.out.print("Quantidade em estoque: ");
            int quantidadeEstoque = teclado.nextInt();

            System.out.print("Preço unitário (R$): ");
            double preco = teclado.nextDouble();

            System.out.println("---------------------");
            
            
            if (quantidadeEstoque < 0) {
                System.out.println("Quantidade inválida. Usando 0 por padrão.");
                quantidadeEstoque = 0;
            }

            if (preco <= 0) {
                System.out.println("Preço inválido. Usando R$1,00 por padrão.");
                preco = 1.0;
            }

            Main novaFerramenta;

            
            if (tipo == 1) {
                novaFerramenta = new Main();
            } else if (tipo == 2) {
                novaFerramenta = new Main();
            } else {
                System.out.println("Tipo inválido. Erro no cadastro.");
                continue; 
            }

            
            produtos.add(novaFerramenta);
            System.out.println("Ferramenta cadastrada com sucesso!");
            
            System.out.println("Digite 0 para voltar ao menu:");
            int voltar = teclado.nextInt();
            teclado.nextLine(); 

            if (voltar == 0) {
                Main.voltaraoMenu();
            } else {
                System.out.println("Encerrando o programa.");
            }
        }
    }
}
