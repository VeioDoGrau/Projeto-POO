package br.com.catolica.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> livrosDisponiveis;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        if (livrosDisponiveis.size() < 100) {
            livrosDisponiveis.add(livro);
            System.out.println("Livro cadastrado");
        } else {
            System.out.println("Limite atingido");
        }
    }

    public Livro localizarLivroPorTitulo(String titulo) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro localizarLivroPorAutor(String autor) {
        for (Livro livro : livrosDisponiveis) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                return livro;
            }
        }
        return null;
    }

    public void verificarDisponibilidade(String titulo) {
        Livro livro = localizarLivroPorTitulo(titulo);
        if (livro != null && livro.estaDisponivel()) {
            System.out.println("O livro '" + titulo + "' está disponível.");
        } else {
            System.out.println("O livro '" + titulo + "' não está disponível.");
        }
    }

    public void exibirInfo() {
        System.out.println("\nBiblioteca: " + nome);
        System.out.println("\nEndereço: " + endereco);
        System.out.println("\nLivros disponíveis: ");
        for (Livro livro : livrosDisponiveis) {
            livro.exibirInfo();
            System.out.println("-----------------");
        }
    }
}