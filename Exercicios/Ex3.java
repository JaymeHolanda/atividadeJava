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
