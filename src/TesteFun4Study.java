import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteFun4Study {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopState;

        System.out.println("...Iniciando...Teste...");
        System.out.println("----- INFORMAÇÕES -----" +
                "\nI. NO PAINEL A SE DEVE ESCOLHER SE QUER ENCERRAR O PROGRAMA OU REGISTRAR UMA NOVA CIDADE E SEUS ESTUDANTES" +
                "\nII. PARA REGISTRAR UMA NOVA CIDADE EH NECESSARIO REGRESSAR AO PAINEL A E SELECIONAR 1 NOVAMENTE" +
                "\nIII. AO ENCERRAR O PROGRAMA (0) SERA LISTADO TODAS AS CIDADES E ESTUDANTES CRIADOS" +
                "\n-----------------------------------------------");
        try {
            do {
                System.out.println(" ");
                System.out.println("----------------------");
                System.out.println(" ");
                System.out.println("#...Escolha [Painel A]");
                System.out.println("0 - Encerrar Programa");
                System.out.println("1 - Registrar Uma Cidade E Seus Estudantes");
                System.out.println(" ");
                loopState = sc.nextInt();

                switch (loopState) {
                    case 0:
                        continue;
                    case 1:
                        Registro.metodoRegistraEstudante();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + loopState);
                }

            } while (loopState != 0);

            Registro.mostrarTudo();
        }
        catch (IndexOutOfBoundsException e) {System.out.println("Error: "+ e.getMessage());}
        catch (InputMismatchException e) {System.out.println("Error: "+ e.getMessage());}
        catch (Exception e) {System.out.println("Error: "+ e.getMessage());}
    }
}
