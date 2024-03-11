import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        System.out.println("Digite seu número aqui  ");

        int numero = scanner.nextInt();
        for (int i = 1 ; i <= numero; i++) {
            if (numero % i == 0) {
                cont ++;
            }
        }
        if (cont == 2) {
            System.out.println(numero + " É número é primo");
        } else {
            System.out.println(numero + " não é primo");
        }




    }
}