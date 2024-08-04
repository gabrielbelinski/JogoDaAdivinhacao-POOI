import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws WrongEntryException, InputMismatchException{
        InventaModificador a = new InventaModificador();
        ConjuntoPalavras b = new ConjuntoPalavras();

        a.escolheModificador();

        System.out.println(b.getPalavra());



    }
}