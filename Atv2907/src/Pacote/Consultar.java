package Pacote;

import java.util.Scanner;

public class Consultar {
    public static void servico2(Scanner teclado) {
        System.out.println("Olá, Bem-vindo!");
   
        
        String tipo;
        String nome;
        int quantidade;
        double valordaunidade;

       
        public Produto(String tipo, String nome, int quantidade, double valordaunidade) {
            this.tipo = tipo;
            this.nome = nome;
            this.quantidade = quantidade;
            this.valordaunidade = valordaunidade;
        }

      
        public String getTipo() {
            return tipo;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getValorUnitario() {
            return valordaunidade;
        }

        
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

       
        public double getValorTotal() {
            return quantidade * valordaunidade;
        }

       
        public String toString() {
            return "Tipo: " + tipo +
                   " \n Nome: " + nome +
                   " \n Quantidade: " + quantidade +
                   "  \nValor Unitario: R$" + String.format("%.2f", valordaunidade);
        }

        
        
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
