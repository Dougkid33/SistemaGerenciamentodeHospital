package view;
import java.util.Scanner;

import controller.PessoaController;

public class ProgramaPrincipal {
    public static void main(String[] args) {
    	
    	Scanner entrada_dados = new Scanner(System.in);
    	 PessoaController controller = new PessoaController();
    	//criacao do usuário já setado previamente como dono de franquia
    	 
         System.out.println("Nome: \n");
         String nome = entrada_dados.nextLine();
         System.out.println("Endereço: \n");
         String endereco = entrada_dados.nextLine();
         System.out.println("CPF: \n");
         String cpf = entrada_dados.nextLine();
         System.out.println("Telefone: \n");
         String telefone = entrada_dados.nextLine();
         System.out.println("Login: \n");
         String login = entrada_dados.nextLine();
         System.out.println("Senha: \n");
         String senha = entrada_dados.nextLine();
         System.out.println("Tipo de Usuário: \n");
         String tipoUsuario = entrada_dados.nextLine();
         controller.adicionarPessoa(nome, endereco, cpf, telefone, login, senha, tipoUsuario);
         System.out.println("\nPessoa adicionada com sucesso!\n");
    	
       
    }
}
