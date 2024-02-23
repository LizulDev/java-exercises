//Calculo de salario com descontos;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // incomeTax (%11), inss (%8), union (%5);
        final double INCOME_TAX_RATE = 0.11;
        final double INSS_RATE = 0.08;
        final double UNION_RATE = 0.05; 
        
        System.out.println("| Calculo de salario |");
        System.out.println("Insira o valor ganho por hora(R$):");
        double perHourPayment = reader.nextDouble();

        System.out.println("Insira o tempo trabalhado por mês(h):");
        int workedHours = reader.nextInt();

        double grossWage = calculateGrossWage(perHourPayment, workedHours);

        double incomeTax = grossWage * INCOME_TAX_RATE;
        double inss = grossWage * INSS_RATE;
        double union = grossWage * UNION_RATE;         

        double liquidWage = calculateLiquidWage(grossWage, incomeTax, inss, union);

        System.out.println("+ Salario Bruto: R$ " + grossWage + "\n" + "- IR(11%): R$ " + incomeTax 
                        + "\n- INSS(8%): R$ " + inss + "\n- Sindicato(5%): R$ " + union + "\nSalario Liquido: R$" + liquidWage+ ".");
        reader.close();
    }

    public static double calculateGrossWage(double perHourPayment, int workedHours){
        return perHourPayment * workedHours;
    } 

    public static double calculateLiquidWage(double grossWage, double incomeTax, double inss, double union){
        return grossWage - (incomeTax + inss + union);
    }

}
