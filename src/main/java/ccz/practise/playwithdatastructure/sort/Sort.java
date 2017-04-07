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

    public static void shellSort(int[] array) {
        int increament = array.length;
        do {
            increament = increament / 3 + 1;
            for(int i=increament; i<array.length; i++) {
                if(array[i] < array[i-increament]) {
                    int temp = array[i];
                    int j=i-increament;
                    while(j>=0 && temp<array[j]) {
                        array[j+increament] = array[j];
                        j-=increament;
                    }
                    array[j+increament] = temp;
                }
            }

        }while(increament > 1);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
