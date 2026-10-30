
package sortingalgorithms;
import java.util.Arrays;
public class Benchmark {
public static long calculateTime(int[] original, int type) {
    int[] arr = Arrays.copyOf(original, original.length);
    
    long start = System.nanoTime();
    
    if (type == 0) {
        SortingAlgorithm.selectionSort(arr);
    } else if (type == 1) {
        SortingAlgorithm.insertionSort(arr);
    } else if (type == 2) {
        SortingAlgorithm.bubbleSort(arr);
    } else if (type == 3) {
        SortingAlgorithm.mergeSort(arr, 0, arr.length - 1);
    } else if (type == 4) {
        SortingAlgorithm.quickSort(arr, 0, arr.length - 1);
    }
    
    long end = System.nanoTime();
    long time = (end - start) / 1000;
    return time;
}
}