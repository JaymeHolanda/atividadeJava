package Questao07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Cliente cliente = Cliente.cadastrar(scanner, formatter);
        Livro livro = Livro.cadastrar(scanner);
        Emprestimo emprestimo = Emprestimo.registrar(scanner, formatter, cliente, livro);
        EmprestimoDTO emprestimoDTO = new EmprestimoDTO(emprestimo);

        System.out.println("\nDetalhes do Empréstimo:");
        System.out.println(emprestimoDTO);

        scanner.close();
    }
}
