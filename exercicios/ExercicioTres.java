//Converter temperatura em Fahrenheit(F) para Celsius(C);
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("| Conversor de temperatura |");
        System.out.println("Digite a temperatura em Fahrenheit");
        double temperatureinFahrenheit = scan.nextDouble();
        
        double temperatureinCelsius = 5*((temperatureinFahrenheit-32)/9);
        
        System.out.println(temperatureinFahrenheit + " em graus Celsius eh: " + temperatureinCelsius + ".\n"); 
        scan.close();
    }
}
