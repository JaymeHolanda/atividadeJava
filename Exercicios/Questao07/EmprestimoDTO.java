package Questao07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmprestimoDTO {
    String nomeCliente;
    String nomeLivro;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;

    // Construtor que aceita um objeto Emprestimo
    public EmprestimoDTO(Emprestimo emprestimo) {
        this.nomeCliente = emprestimo.cliente.nome;
        this.nomeLivro = emprestimo.livro.nome;
        this.dataEmprestimo = emprestimo.dataEmprestimo;
        this.dataDevolucao = emprestimo.dataDevolucao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Detalhes do Empréstimo:\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Livro: " + nomeLivro + "\n" +
                "Data de Empréstimo: " + dataEmprestimo.format(formatter) + "\n" +
                "Data de Devolução: " + dataDevolucao.format(formatter);
    }
}
