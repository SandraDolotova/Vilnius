import java.util.Arrays;
import java.util.Random;


class mainFirstElement {
    public static void main(String[] args) {
        /*  int arr[] = new int[] {5, 8, 1, 3, 7, 9, 2,10};
        // int size = arr.length;
        // int i = 0;
        // System.out.println("Unsorted array: " + Arrays.toString(arr));
        // System.out.print("Pivot = first element: " +  arr[i]);
          System.out.println("\n===================================");
         */

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));
        int i = 0;
        System.out.print("Pivot = first element: " + numbers[i]);

        FirstElement firstElement = new FirstElement();
        System.out.println("\n===================================");
        System.out.println("Sorted Array: ");
        firstElement.recursiveQuickSort(numbers, 0, numbers.length - 1);
        firstElement.printArray(numbers);

       /* System.out.println("\n===================================");
        long timeStarted = System.currentTimeMillis();
        System.out.println("Sorting time check #1: " + (System.currentTimeMillis() - timeStarted));
        System.out.println("\n===================================");
        long beforeTime = System.currentTimeMillis();
        long afterTime = System.currentTimeMillis();
        long diffInMilliSeconds = afterTime - beforeTime;
        System.out.println("Sorting time check #2: " + diffInMilliSeconds);
*/
        System.out.println("\n===================================");
        long startingTime = System.nanoTime();
        Arrays.sort(numbers);
        long endTime = System.nanoTime();
        System.out.println("Sorting time check #3: " + (endTime - startingTime) + " ns");
    }

    public static class FirstElement {
        public int partition(int[] a, int left, int right) {
            int pivot = a[left];
            while (left <= right) {
                while (a[left] < pivot)
                    left++;
                while (a[right] > pivot)
                    right--;
                if (left <= right) {
                    int tmp = a[left];
                    a[left] = a[right];
                    a[right] = tmp;
                    left++;
                    right--;
                }
            }
            return left;
        }

        public void recursiveQuickSort(int[] a, int i, int j) {
            int idx = partition(a, i, j);
            if (i < idx - 1) {
                recursiveQuickSort(a, i, idx - 1);
            }
            if (j > idx) {
                recursiveQuickSort(a, idx, j);
            }
        }

        void printArray(int arr[]) {
            int len = arr.length;
            for (int i = 0; i < len; i++)
                System.out.print(arr[i] + " ");
        }

    }

}


