public class ApsAnaliseAlgoritmo {
    public static void main(final String[] args) throws Exception {
        int[] vetorPiorCaso = gerarVetorPiorCaso();
        int[] vetorMelhorCaso = gerarVetorMelhorCaso();

        final HeapSort heap = new HeapSort();

        // Pior caso
        long tempoInicio = System.currentTimeMillis();

        heap.sort(vetorPiorCaso);

        long tempoPiorCaso = (System.currentTimeMillis() - tempoInicio);

        System.out.println("\n################ Tempo Total Pior caso: " + tempoPiorCaso + " ################");

        // Melhor Caso
        tempoInicio = System.currentTimeMillis();

        heap.sort(vetorMelhorCaso);

        long tempoMelhorCaso = (System.currentTimeMillis() - tempoInicio);

        System.out.println("\n################ Tempo Total Melhor caso: " + tempoMelhorCaso + " ################");
    }

    private static int[] gerarVetorPiorCaso() {
        int QTD_ITEMS = 20000;
        int[] vetor = new int[QTD_ITEMS];

        for (int i = 0; i < QTD_ITEMS; i++) {
            vetor[i] = QTD_ITEMS - i;
        }

        return vetor;
    }

    private static int[] gerarVetorMelhorCaso() {
        int QTD_ITEMS = 20000;
        int[] vetor = new int[QTD_ITEMS];

        for (int i = 0; i < QTD_ITEMS; i++) {
            vetor[i] = i + 1;
        }

        return vetor;
    }
}