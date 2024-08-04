import java.util.Random;
public class TrocaAleatoria implements Modificador {
    @Override
    public String embaralhaPalavra(String palavra) {
        int tamanho = palavra.length();
        char[] vetor = palavra.toCharArray();

        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            int j = random.nextInt(tamanho);
            char aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }

        return new String(vetor);
    }
}
