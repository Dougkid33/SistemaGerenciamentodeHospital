package view;

import java.util.List;

import controller.PessoaController;
import model.Pessoa;

public class ExemploPessoa {
    public static void main(String[] args) {
        PessoaController pessoaController = new PessoaController();

        // Adicionando uma pessoa
        pessoaController.adicionarPessoa("João Silva", "Rua das Flores, 123", "123.456.789-10", "(11) 98765-4321", "joao.silva", "1234", "Usuário");
        System.out.println("Pessoa adicionada com sucesso!");

        // Listando todas as pessoas
        System.out.println("Lista de pessoas:");
        List<Pessoa> pessoas = pessoaController.listarPessoas();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getId() + " - " + pessoa.getNome());
        }

        // Atualizando uma pessoa
        int id = 1;
        Pessoa pessoa = pessoaController.obterPessoa(id);
        if (pessoa != null) {
            pessoaController.atualizarPessoa(id, "João Silva Jr.", pessoa.getEndereco(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getLogin(), pessoa.getSenha(), pessoa.getTipoUsuario());
            System.out.println("Pessoa atualizada com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }

        // Removendo uma pessoa
        id = 1;
        pessoaController.removerPessoa(id);
        System.out.println("Pessoa removida com sucesso!");

        // Listando todas as pessoas
        System.out.println("Lista de pessoas:");
        pessoas = pessoaController.listarPessoas();
        for (Pessoa p : pessoas) {
            System.out.println(p.getId() + " - " + p.getNome());
        }
    }
}
