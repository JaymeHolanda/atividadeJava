package Questao07;

import java.util.Scanner;

public class Livro {
    String nome;
    String autor;
    int quantidadePaginas;
    String editora;

    public Livro(String nome, String autor, int quantidadePaginas, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.quantidadePaginas = quantidadePaginas;
        this.editora = editora;
    }

    public static Livro cadastrar(Scanner scanner) {
        System.out.println("\nCadastro do Livro:");
        System.out.print("Nome do livro: ");
        String nome = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Quantidade de Páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer do scanner
        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        return new Livro(nome, autor, paginas, editora);
    }
}
