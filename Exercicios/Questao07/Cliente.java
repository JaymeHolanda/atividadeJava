package Questao07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente {
    String nome;
    String cpf;
    String endereco;
    LocalDate dataNascimento;
    String telefone;

    public Cliente(String nome, String cpf, String endereco, LocalDate dataNascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public static Cliente cadastrar(Scanner scanner, DateTimeFormatter formatter) {
        System.out.println("Cadastro do Cliente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        return new Cliente(nome, cpf, endereco, dataNascimento, telefone);
    }
}
