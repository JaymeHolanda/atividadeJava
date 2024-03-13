package Questao04;

//4o Escreva um código que receba uma String qualquer e a imprima de forma invertida.

public class Ex4 {

    public static void main(String[] args) {
        // variantes


        String texto = "estude java";
        String textoInvertido = "";

        // Laço que percorre cada caractere da string

        for (int i = texto.length() -1 ; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);
    }
}
