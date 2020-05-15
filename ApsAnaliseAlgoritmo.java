public class ApsAnaliseAlgoritmo {
    private static HeapSort heap = new HeapSort();

    public static void main(final String[] args) throws Exception {

        ordernarPiorCaso();
        ordenarMelhorCaso();

        // ordernarPiorCaso();
        // ordenarMelhorCaso();
    }

    private static void ordernarPiorCaso() {
        int[] vetorPiorCaso = gerarVetorPiorCaso();

        // Inicia a contagem
        long inicio = System.currentTimeMillis();

        heap.sort(vetorPiorCaso);

        // Termina a contagem
        long tempo = (System.currentTimeMillis() - inicio);

        System.out.println(
                "\n\nCom o vetor de pior caso (Ao Contrário)" + "\nA ordenação foi feita em: " + tempo + " Milissegundos");
    }

    private static void ordenarMelhorCaso() {
        int[] vetorMelhorCaso = gerarVetorMelhorCaso();

        // Inicia a contagem
        long inicio = System.currentTimeMillis();

        heap.sort(vetorMelhorCaso);

        // Termina a contagem
        long tempo = (System.currentTimeMillis() - inicio);

        System.out.println(
                "\n\nCom o vetor de melhor caso (Já ordenado)" + "\nA ordenação foi feita em: " + tempo + " Milissegundos");
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