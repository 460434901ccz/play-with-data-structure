package ccz.practise.playwithdatastructure.search;

/**
 * Created by visionsky on 2017/4/5.
 */
public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int lowIndex=0, highIndex=array.length-1, mid=(highIndex+lowIndex)/2;

        while(array[mid]!=key && lowIndex<highIndex) {
            if(array[mid]<key) {
                lowIndex = mid+1;
                mid=(highIndex+lowIndex)/2;
            } else {
                highIndex = mid-1;
                mid=(highIndex+lowIndex)/2;
            }
        }
        if(array[mid]!=key) return -1;
        else return mid;
    }
}
