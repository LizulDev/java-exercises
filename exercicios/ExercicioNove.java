/*Construir um algoritmo que leia 2 números e efetue a adição. Caso o
valor somado seja maior que 20, este deverá ser apresentando somandose a ele mais 8; caso o valor somado seja menor ou igual a 20, este deverá
ser apresentado subtraindo-se 5.*/

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int numbers = 0, sumNumbers = 0;
        for (int index = 0; index < 2; index++){
            System.out.println("Insira o " + (index+1) +" número:");
            numbers = scan.nextInt();
            sumNumbers = sumNumbers + numbers;
        }
        if (sumNumbers > 20){
            System.out.println("O resultado eh " + sumNumbers + " + 8 = " + (sumNumbers += 8) + ".");
        } else {
            System.out.println("O resultado eh " + sumNumbers + " - 5 = " + (sumNumbers -= 5) + ".");
        }

        scan.close();
    }
}
