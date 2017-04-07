package ccz.practise.playwithdatastructure.sort;

/**
 * Created by visionsky on 2017/4/7.
 */
public abstract class Sort {

    public static void bubbleSort(int[] array) {
        for(int i=1; i<=array.length; i++) {
            for(int j=array.length-i; j>0; j--) {
                if(array[j]<array[j-1]) {
                    swap(array, j, j-1);
                }
            }
        }
    }

    public static void simpleSelectionSort(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            int min = i;
            for(int j=i+1; j<array.length; j++) {
                if(array[min]>array[j]) min = j;
            }
            if(min!=i) swap(array, i, min);
        }
    }

    public static void straightInsertionSort(int[] array) {
        for(int i=1; i<array.length; i++) {
            int temp = array[i];
            int j=i;
            while(j>0 && temp<array[j-1]) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
