public class Insertion {

    public void insertionSort(int [] lista, int left, int right) {
        for(int i =left; i<=right; i++) {
            int key = lista[i];
            int j = i-1;
            while (j >= left && lista[j] > key)
            {
                lista[j+1] = lista[j];
                j--;
            }
            lista[j+1] = key;
        }
    }

}
