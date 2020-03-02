
public class BubbleSort {

    /**
     * Bubble Sort algorithms using arrays
     *
     * @param arr
     */
    static void bubbleSort(int[] arr) {
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    /**
     * Method for printing the bubble sort output
     *
     * @param arr
     */
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {345, 567, 123, 577, 647};
        bubbleSort(arr);
        printArray(arr);
    }
}
