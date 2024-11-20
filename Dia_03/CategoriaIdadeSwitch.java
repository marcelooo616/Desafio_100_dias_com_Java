import java.util.Scanner;

public class CategoriaIdadeSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        String categoria;
        switch (idade / 10) { // Dividimos a idade por 10 para simplificar as faixas
            case 0: // 0 a 9
            case 1: // 10 a 12
                categoria = "Criança";
                break;
            case 2: // 13 a 19 (Adolescente)
                categoria = idade <= 17 ? "Adolescente" : "Adulto";
                break;
            case 3: case 4: case 5: case 6: // 20 a 64 (Adulto)
                categoria = "Adulto";
                break;
            default: // 65 ou mais (Idoso)
                categoria = idade >= 65 ? "Idoso" : "Idade inválida!";
                break;
        }

        System.out.println("Categoria: " + categoria);

        scanner.close();
    }
}

