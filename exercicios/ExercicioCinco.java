//Qual dentre os dois valores é o maior;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        int valueOne = reader.nextInt();

        System.out.println("Digite o segundo valor");
        int valueTwo = reader.nextInt();
        
        if(valueOne > valueTwo) {
            System.out.println(valueOne + " eh maior que " + valueTwo);
        } else if (valueOne < valueTwo) {
            System.out.println(valueTwo + " eh maior que " + valueOne);
        } else {
            System.out.println(valueOne +" e "+ valueTwo + " sao iguais!");
        } 
         
        reader.close();
    }
}
