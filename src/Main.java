import java.util.Random;

public class Main {

    public static void main(String[] args) {
        TimSort timSort;
        Random rand = new Random();
        int lon;
        lon =rand.nextInt(6,50);

        int[] lista= new int[lon];
        int[] listaord;

        for(int i=0;i<lon;i++){
            lista[i] = rand.nextInt(-100,100);
        }
   /*     for(int i = 0; i<lon; i++){
            System.out.print(lista[i]+" ");
        }

        System.out.println(" ordenada");*/
        
        timSort = new TimSort(lista);
        timSort.Timsort();
        listaord= timSort.returnlista();
        //Aca va lo de la interfaz
        for(int i = 0; i<lon; i++){
            System.out.print(listaord[i]+" ");
        }

    }

}