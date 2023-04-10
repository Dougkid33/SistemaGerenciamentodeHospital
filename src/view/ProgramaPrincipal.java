package view;

import java.util.Date;
import java.util.Scanner;
import model.Pessoa;
import model.PessoaDAO;



public class ProgramaPrincipal {
	private static PessoaDAO pessoaDAO;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			String usuario;
			String senha;
			pessoaDAO = new PessoaDAO();
			
			// Solicita o nome de usuário
			System.out.print("Digite o nome de usuário: ");
			 usuario = scanner.nextLine();

			// Solicita a senha
			System.out.print("Digite a senha: ");
			senha = scanner.nextLine();
			
			while(usuario != "admin" && senha != "admin123") {
			    // Solicita o nome de usuário
			    System.out.print("Digite o nome de corretamente usuário: ");
			     usuario = scanner.nextLine();
			     
			     // Solicita a senha
			     System.out.print("Digite a senha corretamente: ");
			     senha = scanner.nextLine();
				
			}
			while(usuario.equals("admin") && senha.equals("admin123")) {
				
			        int opcao = -1;

			        while (opcao != 0) {
			            System.out.println("MENU DE OPÇÕES -- Pessoa");
			            System.out.println("1 - Adicionar Pessoa");
			            System.out.println("2 - Atualizar Pessoa");
			            System.out.println("3 - Remover Pessoa");
			            System.out.println("4 - Obter Pessoa");
			            System.out.println("5 - Listar Pessoas");
			            System.out.println("0 - Sair");

			            System.out.print("Escolha uma opção: ");
			            opcao = scanner.nextInt();
			            scanner.nextInt();

			            switch (opcao) {
			                case 1:
			                    System.out.println("Adicionar pessoa:");
			                    System.out.print("Nome: ");
			                    String nome = scanner.nextLine();
			                    System.out.print("Endereço: ");
			                    String endereco = scanner.nextLine();
			                    System.out.print("CPF: ");
			                    String cpf = scanner.nextLine();
			                    System.out.print("Telefone: ");
			                    String telefone = scanner.nextLine();
			                    System.out.print("Login: ");
			                    String login = scanner.nextLine();
			                    System.out.print("Senha: ");
			                    String senha1 = scanner.nextLine();
			                    System.out.print("Tipo de usuário: ");
			                    String tipoUsuario = scanner.nextLine();
			                    Pessoa pessoa = new Pessoa(0, nome, endereco, cpf, telefone, login, senha1, tipoUsuario, new Date(), new Date());
			                    pessoaDAO.adicionarPessoa(pessoa);
			                    System.out.println("Pessoa adicionada com sucesso!");
			                    break;
			                case 2:
			                    System.out.println("Atualizar pessoa:");
			                    System.out.print("Digite o ID da pessoa a ser atualizada: ");
			                    int id = scanner.nextInt();
			                    Pessoa pessoaExistente = pessoaDAO.obterPessoa(id);
			                    if (pessoaExistente != null) {
			                        System.out.print("Digite o nome: ");
			                         nome = scanner.next();
			                        System.out.print("Digite o endereço: ");
			                         endereco = scanner.next();
			                        System.out.print("Digite o CPF: ");
			                         cpf = scanner.next();
			                        System.out.print("Digite o telefone: ");
			                       telefone = scanner.next();
			                        System.out.print("Digite o login: ");
			                         login = scanner.next();
			                        System.out.print("Digite a senha: ");
			                         senha = scanner.next();
			                        System.out.print("Digite o tipo de usuário: ");
			                         tipoUsuario = scanner.next();
			                        pessoaExistente.setNome(nome);
			                        pessoaExistente.setEndereco(endereco);
			                        pessoaExistente.setCpf(cpf);
			                        pessoaExistente.setTelefone(telefone);
			                        pessoaExistente.setLogin(login);
			                        pessoaExistente.setSenha(senha);
			                        pessoaExistente.setTipoUsuario(tipoUsuario);
			                        pessoaDAO.atualizarPessoa(pessoaExistente);
			                        System.out.println("Pessoa atualizada com sucesso!");
			                    } else {
			                        System.out.println("Pessoa não encontrada.");
			                    }
			                    break;
			                case 3:
			                	System.out.println("Remover pessoa:");
			                    System.out.print("Digite o ID da pessoa a ser removida: ");
			                    int idRemover = scanner.nextInt();
			                    Pessoa pessoaRemover = pessoaDAO.obterPessoa(idRemover);
			                    if (pessoaRemover != null) {
			                        pessoaDAO.removerPessoa(idRemover);
			                        System.out.println("Pessoa removida com sucesso!");
			                    } else {
			                        System.out.println("Pessoa não encontrada.");
			                    }
			                    break;

			                case 4:
			                    System.out.println("Obter Pessoa:");
			                    System.out.print("Digite o ID da pessoa a ser obtida: ");
			                     id = scanner.nextInt();
			                     pessoa = pessoaDAO.obterPessoa(id);
			                    if (pessoa != null) {
			                        System.out.println(pessoa.toString());
			                    } else {
			                        System.out.println("Pessoa não encontrada.");
			                    }
			                    break;
			                case 5:
			                    // Listar todas as pessoas
			                    Pessoa[] pessoas = pessoaDAO.listarPessoas();
			                    if (pessoas.length < 0) {
			                        System.out.println("Não há pessoas cadastradas.");
			                    } else {
			                        System.out.println("Pessoas cadastradas:");
			                        for (Pessoa p : pessoas) {
			                            System.out.println("ID: " + p.getId());
			                            System.out.println("Nome: " + p.getNome());
			                            System.out.println("Endereço: " + p.getEndereco());
			                            System.out.println("CPF: " + p.getCpf());
			                            System.out.println("Telefone: " + p.getTelefone());
			                            System.out.println("Login: " + p.getLogin());
			                            System.out.println("Senha: " + p.getSenha());
			                            System.out.println("Tipo de usuário: " + p.getTipoUsuario());
			                            System.out.println("Data de criação: " + p.getDataCriacao());
			                            System.out.println("-----------------------------");
			                        }
			                    }
			                    break;
			                case 0:
			                    System.out.println("Saindo do sistema...");
			                    break;
			                default:
			                    System.out.println("Opção inválida. Tente novamente.");
			            }

			            System.out.println();
			        }

			        
			    }
		}
        
        	
        }
    

    }

