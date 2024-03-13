package Questao05;

import java.util.Arrays;

//5o Escreva um código que receba uma String simples (apenas uma palavra) e monte um array
//        com os valores respectivos a cada letra da palavra, os organize em ordem crescente, imprima
 //       esse array e a palavra na nova ordem.
public class Ex5 {

    public static void main(String[] args) {



        String palavra = "Animal";
        int[] valoresLetras = new int[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            valoresLetras[i] = (int) letra - 97;
        }

        // Ordena o array de valores
        Arrays.sort(valoresLetras);

        // Constrói a palavra ordenada
        StringBuilder palavraOrdenada = new StringBuilder();
        for (int valor : valoresLetras) {
            char letra = (char) (valor + 97);
            palavraOrdenada.append(letra);
        }

        System.out.println("Palavra original: " + palavra);
        System.out.println("Array original: " + Arrays.toString(valoresLetras));
        System.out.println("Array ordenado: " + Arrays.toString(valoresLetras));
        System.out.println("Palavra ordenada: " + palavraOrdenada.toString());
    }
}
