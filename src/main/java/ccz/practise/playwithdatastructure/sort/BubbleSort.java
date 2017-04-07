package ccz.practise.playwithdatastructure.sort;

/**
 * Created by visionsky on 2017/4/7.
 */
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for(int i=1; i<=array.length; i++) {
            for(int j=array.length-i; j>0; j--) {
                if(array[j]<array[j-1]) {
                    swap(array, j, j-1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
