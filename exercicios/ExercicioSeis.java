import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("| Biblioteca Universitaria |");
        System.out.println("Digite o nome do livro:");
        String book = scan.nextLine();
       
        System.out.println("Digite |P| para professor ou |A| para aluno:");
        String userType = scan.nextLine().toUpperCase();
       
        switch (userType) {
        case "P":
            userType = "Professor";
            System.out.println(userType +" - "+book);
            System.out.println("Voce tem 10 dias para devolver este livro!");
            break;
        case "A":
            userType = "Aluno";
            System.out.println(userType +" - "+book);
            System.out.println("Voce tem 3 dias para devolver este livro!");
            break;
        default:
            System.out.println("Escolha errada, tente novamente!");
            break;
       }

       scan.close();
    }
}
