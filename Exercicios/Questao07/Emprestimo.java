package Questao07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Emprestimo {
    Cliente cliente;
    Livro livro;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;

    public Emprestimo(Cliente cliente, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public static Emprestimo registrar(Scanner scanner, DateTimeFormatter formatter, Cliente cliente, Livro livro) {
        System.out.println("\nEmpréstimo do Livro:");
        System.out.print("Data de Empréstimo (dd/MM/yyyy): ");
        LocalDate dataEmprestimo = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.print("Data de Devolução (dd/MM/yyyy): ");
        LocalDate dataDevolucao = LocalDate.parse(scanner.nextLine(), formatter);

        return new Emprestimo(cliente, livro, dataEmprestimo, dataDevolucao);
    }
}
