//Compra de maças em uma venda;
import java.util.Scanner;
public class ExercicioSete {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("// Venda da Dona Tertulina //");
        System.out.println("Digite a quantidade de macas a serem compradas:");
        int appleQuantity = reader.nextInt();
        
        if (appleQuantity < 12){
            double appleValue = 0.3;
            double purchaseValue = appleQuantity*appleValue;
            System.out.println("O valor total da compra eh "+purchaseValue);
        } else {
            double appleValue = 0.25;
            double purchaseValue = appleQuantity*appleValue;
            System.out.println("O valor total da compra eh R$"+purchaseValue);
        }
        
        reader.close();
    }
}
