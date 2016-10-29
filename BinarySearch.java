
package search.algorithms;


public class BinarySearch {
    /*
    input haystack: sorted array
    input needle: value to find
    output: index of the element with the value needle. If not found, return 
    the negative where it would be, minus 1, i.e. (-(insertion point) - 1)
    */
    public static int search(final int[] haystack, final int needle) {
        int low, high;
        low = 0;
        high = haystack.length - 1;
        while(low <= high) {
            int middle = (low + high) >>> 1;//prevent integer overflow
            if(haystack[middle] == needle) {
                return middle; //found location of needle
            } else if(haystack[middle] < needle) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
            
        }
        
        return -low -1; //failure, return neg. of where it would go -1
    }
}
