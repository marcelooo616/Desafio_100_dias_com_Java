package Dia_05;

import java.util.HashSet;

public class HashSetNomes {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();

        // Adicionando os mesmos 5 nomes
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Ana"); // Nome duplicado
        nomes.add("Eduardo");

        // Usando um loop para imprimir os nomes
        System.out.println("Nomes no HashSet (sem duplicados):");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

