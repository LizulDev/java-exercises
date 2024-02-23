//Troca de variáveis;

public class ExercicioDois {
    public static void main(String[] args) {
        int variableOne = 10, variableTwo = 20, temp= 0;
        System.out.println("Antes da troca: var1 - " + variableOne +" e  var2 - "+ variableTwo + ".");
        temp = variableOne;
        variableOne = variableTwo;
        variableTwo = temp;
        System.out.println("Depois da troca: var1 - " + variableOne +" e var2 - "+ variableTwo + ".");

    }
}
