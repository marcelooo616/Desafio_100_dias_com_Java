package Dia_05;

import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 3}; // Criando o array

        // Ordenando o array
        Arrays.sort(numeros);

        // Imprimindo o array ordenado
        System.out.println("Array ordenado:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

