//Escreva um algoritmo para ler as dimensões de um retângulo (base e
//altura), calcular e escrever a área do retângulo. Considerar fórmula do
//retângulo: base (b) x altura (h);

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insira o valor da base\n\r");
        int reactangleBase = reader.nextInt();
        System.out.println("Insira o valor da altura:\n\r");
        int rectangleHeight = reader.nextInt();
        System.out.println("A area do retangulo eh: " + (reactangleBase*rectangleHeight));
        reader.close();
    }
}