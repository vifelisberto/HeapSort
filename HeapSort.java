public class HeapSort {

    public void sort(final int arr[]) {
        final int n = arr.length;

        // Constroi o max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            final int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private void heapify(final int arr[], final int n, final int i) {
        // Encontra o maior entre raiz, filho esquerdo e direito.
        int largest = i;
        final int l = 2 * i + 1;
        final int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Troca e continua empilhando caso a raiz não seja o maior.
        if (largest != i) {
            final int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}