package Questao02;

import java.util.Random;
import java.util.Scanner;

//2o Escrever um código que sorteie um número randômico de 0 a 1000, peça um número inteiro
//neste intervalo, se o usuário errar, informar se o valor sorteado é maior ou menor que o
//informado e solicitar outro número do usuário até que ele acerte o número. Quando acertar,
//informar a quantidade de palpites que ele informou até acertar.

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //variantes

        int numeroSorteado = random.nextInt(1001);
        int numeroUsuario = 0;
        int palpites = 0;

        // Laço de repetição while

        while (numeroUsuario != numeroSorteado) {
            palpites++;
            System.out.println("Digite um número entre 0 e 1000: ");
            numeroUsuario = Integer.parseInt(scanner.nextLine());

            // condicional

            if (numeroUsuario > numeroSorteado) {
                System.out.println("O número sorteado é menor que " + numeroUsuario);
            } else if (numeroUsuario < numeroSorteado) {
                System.out.println("O número sorteado é maior que " + numeroUsuario);
            }
        }

        System.out.println("Parabéns! Você conseguiu advinhar o número !! : " + numeroSorteado);
        System.out.println("Você realizou " + palpites + " palpites para conseguir chegar no número sorteado!!.");
    }
}
