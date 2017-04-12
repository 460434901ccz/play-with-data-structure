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

    public static void mergeSort(int[] array) {
        final int[] mergeArray =  merge(array);
        for(int i=0; i<array.length; i++) {
            array[i] = mergeArray[i];
        }
    }

    private static int[] merge(int[] array) {
        if(array.length==1) return array;

        int[] array1 = new int[array.length/2];
        int[] array2 = new int[array.length - array1.length];

        for(int i=0; i<array1.length; i++) {
            array1[i] = array[i];
        }
        for(int i=0; i<array2.length; i++) {
            array2[i] = array[i+array1.length];
        }

        array1 = merge(array1);
        array2 = merge(array2);


        int[] mergeArray = new int[array1.length+array2.length];
        int i=0, j=0, k=0;
        while(i<array1.length && j<array2.length) {
            if(array1[i]<array2[j]) {
                mergeArray[k++] = array1[i++];
            } else {
                mergeArray[k++] = array2[j++];
            }
        }
        while(i<array1.length) {
            mergeArray[k++] = array1[i++];
        }
        while(j<array2.length) {
            mergeArray[k++] = array2[j++];
        }

        return mergeArray;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
