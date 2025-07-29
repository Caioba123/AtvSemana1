package Pacote;

import java.util.Scanner;

public class Atualizar {
	public static void servico3(Scanner teclado) {
        System.out.println("Olá, Bem-vindo!");
        
        
        System.out.println("Escolha qual ferramenta deseja atualizar:");
        System.out.println("1 - Furadeira");
        System.out.println("2 - Martelo");
        System.out.println("3 - Serra Elétrica");
        System.out.println("4 - Alicate");
        System.out.println("5 - Lixadeira");



        int escolha = teclado.nextInt();



        String nomeFerramenta = "";
        if (escolha == 1) {
            nomeFerramenta = "Furadeira";
        } else if (escolha == 2) {
            nomeFerramenta = "Martelo";
        } else if (escolha == 3) {
            nomeFerramenta = "Serra Elétrica";
        } else if (escolha == 4) {
            nomeFerramenta = "Alicate";
        } else if (escolha == 5) {
            nomeFerramenta = "Lixadeira";
        } else {

            System.out.println("Ferramenta inválida.");
            teclado.close();
            return;

        }



        System.out.print("Digite a nova quantidade em estoque para " + nomeFerramenta + ": ");
        int novaQuantidade = teclado.nextInt();



        System.out.println("--- Estoque Atualizado ---");
        System.out.println("Ferramenta: " + nomeFerramenta);
        System.out.println("Nova quantidade em estoque: " + novaQuantidade + " unidades");
        
       
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
