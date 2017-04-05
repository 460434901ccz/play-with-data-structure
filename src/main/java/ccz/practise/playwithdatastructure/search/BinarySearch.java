package ccz.practise.playwithdatastructure.search;

/**
 * Created by visionsky on 2017/4/5.
 */
public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int lowIndex=0, highIndex=array.length-1;

        while(lowIndex <= highIndex) {
            int mid = (highIndex+lowIndex)/2;
            if(array[mid] < key) {
                lowIndex = mid + 1;
            } else if(array[mid] > key){
                highIndex = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
