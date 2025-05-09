package service;

public class Questao05 {

    public void inverterString(String texto) {

        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        System.out.println("Texto invertido: "+invertida);
    }
}
