package br.com.catolica.biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String id;
    private String email;
    private ArrayList<Livro> livrosEmPosse;

    public Usuario(String nome, String id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.livrosEmPosse = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        if (livrosEmPosse.size() < 5 && livro.estaDisponivel()) {
            livrosEmPosse.add(livro);
            livro.emprestar();
            System.out.println("\nEmpréstimo feito");
        } else {
            System.out.println("\nNão foi possível realizar o empréstimo");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmPosse.contains(livro)) {
            livrosEmPosse.remove(livro);
            livro.devolver();
            System.out.println("\nLivro devolvido");
        } else {
            System.out.println("\nVocê não está com esse livro");
        }
    }

    public void exibirInfo() {
        System.out.println(
                "\nNome: " + nome +
                "\nID: " + id +
                "\nEmail: " + email +
                "\nLivros em posse: "
                );

        for (Livro livro : livrosEmPosse) {
            System.out.println(" - " + livro.getTitulo());
        }
    }
}