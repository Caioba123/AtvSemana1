package Pacote;

import java.util.Scanner;
import Pacote7.Main;

public class Main {
    
    public static void voltaraoMenu() {
        String[] args = null;
        main(args);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--Bem vindo a nossa empresa-- ");
        System.out.println("Você quer acessar qual dos nossos menus?");
        System.out.println("1 - Cadastrar ferramentas");
        System.out.println("2 - Consultar estoque");
        System.out.println("3 - Atualizar quantidade");
        System.out.println("4 - Verificar itens com estoque baixo");
        System.out.println("5 - Calcular o valor total do inventário");
        
        int menu = teclado.nextInt();

       

if (menu == 1) {
	Cadastrar cadastrar = new Cadastrar();
	cadastrar.servico1(teclado);

} else if (menu == 2) {
    Consultar consultar = new Consultar();
    consultar.servico2(teclado);

} else if (menu == 3) {
    Atualizar atualizar = new Atualizar();
    atualizar.servico3(teclado);

} else if (menu == 4) {
    Verificar verificar = new Verificar();
    verificar.servico4(teclado);

} else if (menu == 5) {
    Calcular calcular = new Calcular();
    calcular.servico5(teclado);

} else {
    System.out.println("Opção inválida.");
          }
       }
    }