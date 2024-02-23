//Conversor de metros para centimetros - Meter to Centimeter Converter;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int meter;
        double convertMetertoCentimeter;
        System.out.println("| Conversor de metros para centimetros |");
        System.out.println("Insira uma medida em metros:");
        meter = reader.nextInt();
        convertMetertoCentimeter = (double)(meter*100);
        System.out.println("O valor " + meter + " em centimetros eh: " + convertMetertoCentimeter + ".\n");
        reader.close();
    }
}
