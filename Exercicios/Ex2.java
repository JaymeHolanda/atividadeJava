import java.util.Random;
import java.util.Scanner;

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
