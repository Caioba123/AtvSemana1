package Pacote;

import java.util.Scanner;

public class Verificar {
	public static void servico4(Scanner teclado) {
        System.out.println("Olá, Bem-vindo!");
        
        
        
        
       
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

