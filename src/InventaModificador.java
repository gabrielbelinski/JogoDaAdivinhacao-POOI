import java.util.InputMismatchException;
import java.util.Scanner;
public class InventaModificador {

    private int opcao = 0;

    public int escolheModificador() throws WrongEntryException, InputMismatchException {
        System.out.println("Escolha a forma de embaralhamento(1 a 3): ");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                opcao = scanner.nextInt();
                testaValores(opcao);
                break;
            } catch (InputMismatchException iae) {
                System.out.println("Erro: O valor inserido não é um inteiro entre 1 e 3. Tente novamente.");
                scanner.nextLine();
            } catch (WrongEntryException w) {
                System.out.println(w.getMessage());
                scanner.nextLine();
            }
            }
        scanner.close();
        return this.opcao;
        }

    public static void testaValores(int valor) throws WrongEntryException {
        if(valor < 1 || valor > 3){
            throw new WrongEntryException("Erro: O valor inserido não está entre 1 e 3. Tente novamente.");
        }
    }
}
