package br.com.catolica.biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private int quantidadeEstoque;

    public Livro(String titulo, String autor, String isbn, int anoPublicacao, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaDisponivel() {
        return quantidadeEstoque > 0;
    }

    public void emprestar() {
        if (estaDisponivel()) {
            quantidadeEstoque--;
        } else {
            System.out.println("\nDá não");
        }
    }

    public void devolver() {
        quantidadeEstoque++;
    }

    public void exibirInfo() {
        System.out.println(
                "\nTítulo: " + titulo +
                "\nAutor: " + autor +
                "\nISBN: " + isbn +
                "\nAno de Publicação: " + anoPublicacao +
                "\nQuantidade em Estoque: " + quantidadeEstoque
        );
    }
}