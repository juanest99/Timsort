import java.util.Random;

public class Main {

    public static void main(String[] args) {
        TimSort timSort;
        Random rand = new Random();
        int lon;
        lon =rand.nextInt(6,50);

        int[] lista= new int[lon];


        for(int i=0;i<lon;i++){
            lista[i] = rand.nextInt(-100,100);
        }
        int[] listaori= lista.clone();

        timSort = new TimSort(lista);
        timSort.Timsort();
        int [] listaord= timSort.returnlista();

        // Mostrar los vectores en una ventana
        new VentanaVector(listaori, listaord);

    }

}