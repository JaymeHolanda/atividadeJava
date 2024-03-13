package Questao03;

//3o Escreva um código que receba um nome completo em forma de String e mostre as iniciais
//do nome.
public class Ex3 {

    public static void main(String[] args) {
        String nome = "Jayme Holanda Aguiar";
        StringBuilder iniciais = new StringBuilder();

        for (char letra : nome.toCharArray()) {
            if (Character.isUpperCase(letra)) {
                iniciais.append(letra);
            }
        }

        System.out.println("Iniciais: " + iniciais.toString());
    }
}
