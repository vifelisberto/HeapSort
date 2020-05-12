import java.util.Arrays;
import java.util.Random;

public class ApsAnaliseAlgoritmo {
    public static void main(final String[] args) throws Exception {

        int[] vetor = new int[20000];

        Random random = new Random();

        for (int i = 0; i < 20000; i++) {
            int numero = random.nextInt(20000);
            vetor[i] = numero;
        }

        // System.out.println("Não Ordenado: ");
        // System.out.println(Arrays.toString(vetor));

        long tempoInicio = System.currentTimeMillis();

        final HeapSort heap = new HeapSort();
        heap.sort(vetor);

        long tempo = (System.currentTimeMillis() - tempoInicio);

        // System.out.println("Ordenado: ");
        // System.out.println(Arrays.toString(vetor));

        System.out.println("Tempo Total: " + tempo + " segundos");
    }
}