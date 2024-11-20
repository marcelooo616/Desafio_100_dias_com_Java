import java.util.Scanner;

public class CategoriaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Categoria: Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Categoria: Adulto");
        } else if (idade >= 65) {
            System.out.println("Categoria: Idoso");
        } else {
            System.out.println("Idade inválida!");
        }

        scanner.close();
    }
}

