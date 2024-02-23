//Leitura em comparaçao de três numeros inteiros;

import java.util.Scanner;
import java.util.Arrays;


public class ExercicioOito {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       
        int[] values = new int[3];
        for(int i = 0; i < values.length; i++){
            System.out.println("Insira o valor " + (i+1) + ":");
            values[i] = reader.nextInt();
        }

        Arrays.sort(values);

        System.out.println(values[2] + " eh o maior e " + values[0] + " eh o menor.");
        reader.close();        
    }
}
