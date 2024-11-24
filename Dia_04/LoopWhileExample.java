package Dia_04;

import java.util.Scanner;

public class LoopWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Insira números (0 para sair):");
        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            System.out.println("Você inseriu: " + numero);
        }

        System.out.println("Encerrando...");
        scanner.close();
    }
}

