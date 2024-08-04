import java.util.ArrayList;
import java.util.Random;
public class ConjuntoPalavras {
    private ArrayList<String> palavras = new ArrayList<>();
    private String palavra;

    public ConjuntoPalavras(){
        palavras.add("abacaxi");
        palavras.add("hipopotamo");
        palavras.add("sorvete");
        palavras.add("universo");
        palavras.add("uva");
        palavras.add("diamante");
        palavras.add("girassol");
        palavras.add("jacare");
        palavras.add("elefante");
        palavras.add("computador");
        palavras.add("dinossauro");

    }


    public String getPalavra(){
        Random gerador = new Random();
        int indice = gerador.nextInt(palavras.size());
        this.palavra = palavras.get(indice);
        return this.palavra;
    }
}

