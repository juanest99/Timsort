
public class TimSort {
    static final int RUN=32;
    int[] lista;
    Insertion insercion= new Insertion();
    Merge merge= new Merge();
    public TimSort(int[] lista) {
        this.lista = lista;
    }
    public void Timsort() {
        int n = lista.length;
        for (int i = 0; i < n; i += RUN) {
            insercion.insertionSort(lista, i, Math.min((i + 31), (n - 1)));

        }

        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                if (mid < right) {
                    merge.mergeSort(lista, left, mid, right);
                }
            }
        }
    }
    public int[] returnlista(){
        return lista;
    }
}
