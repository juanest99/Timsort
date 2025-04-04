public class Merge {
    public void mergeSort(int[] lista, int left,int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copiar datos a arreglos temporales
        for (int i = 0; i < n1; i++)
            L[i] = lista[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = lista[mid + 1 + j];

        // Mezclar los arreglos temporales de nuevo en lista[left..right]
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                lista[k] = L[i];
                i++;
            } else {
                lista[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiar elementos restantes
        while (i < n1) {
            lista[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            lista[k] = R[j];
            j++;
            k++;
        }
    }


}
