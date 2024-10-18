package br.com.catolica.biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca de Alexandria", "Rua do Limoeiro, 777");

        Livro livro1 = new Livro("Senhor dos Pasteis", "Rambo", "123456", 2021, 3);
        biblioteca.cadastrarLivro(livro1);

        Livro livro2 = new Livro("Harry e a Pedra não filosofal", "Hulk", "654321", 2019, 2);
        biblioteca.cadastrarLivro(livro2);

        Usuario usuario = new Usuario("Pedro Birimbinha", "001", "bananamanDaSilva@gmail.com");
        usuario.emprestarLivro(livro1);

        System.out.println("\nO usuário procura saber se seu livro está disponivel");
        biblioteca.verificarDisponibilidade("Senhor dos Pasteis");


        usuario.exibirInfo();

        biblioteca.exibirInfo();

        usuario.devolverLivro(livro1);
    }
}
