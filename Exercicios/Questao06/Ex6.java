import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//6o Escreva um código que tenha uma classe chamada Aluno, que receba três notas do tipo inteiro
//        e o nome do aluno do tipo String.       Pergunte ao usuário o nome do aluno e as três notas, continue pedindo alunos e notas até que o
//       usuário digite “sair” como nome do aluno.
//      Quando o usuário digitar “sair”, imprima a nota e média das notas de todos os alunos.
//    Imprimir a média geral da turma.


// Código dando erro ao perguntar outra pessoa
public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do aluno (ou sair para finalizar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite a primeira nota do aluno: ");
            int nota1 = scanner.nextInt();

            System.out.println("Digite a segunda nota do aluno: ");
            int nota2 = scanner.nextInt();

            System.out.println("Digite a terceira nota do aluno: ");
            int nota3 = scanner.nextInt();

            alunos.add(new Aluno(nome, nota1, nota2, nota3));
        }

        int totalNotas = 0;
        int somaNotas = 0;
        int aprovados = 0;
        int reprovados = 0;

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            totalNotas += 3;
            somaNotas += aluno.getMedia();

            if (aluno.getMedia() >= 6) {
                aprovados++;
                System.out.println("Aluno aprovado!");
            } else {
                reprovados++;
                System.out.println("Aluno reprovado!");
            }
        }

        System.out.println("Média geral da turma: " + (float) somaNotas / totalNotas);
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos reprovados: " + reprovados);

        System.out.println("Lista de alunos aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() >= 6) {
                System.out.println(aluno.getNome());
            }
        }

        System.out.println("Lista de alunos reprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() < 6) {
                System.out.println(aluno.getNome());
            }
        }
    }
}

class Aluno {

    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    public Aluno(String nome, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public int getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + getMedia() +
                '}';
    }
}