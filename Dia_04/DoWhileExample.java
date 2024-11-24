package Dia_04;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "12345"; // Defina a senha correta
        String senhaInserida;

        do {
            System.out.print("Insira a senha: ");
            senhaInserida = scanner.nextLine();
            if (!senhaInserida.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaInserida.equals(senhaCorreta));

        System.out.println("Acesso concedido!");
        scanner.close();
    }
}

