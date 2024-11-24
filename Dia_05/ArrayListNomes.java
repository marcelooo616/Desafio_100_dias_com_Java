package Dia_05;

import java.util.ArrayList;

public class ArrayListNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando 5 nomes
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Ana"); // Nome duplicado
        nomes.add("Eduardo");

        // Usando um loop para imprimir os nomes
        System.out.println("Nomes na ArrayList:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

