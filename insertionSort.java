package sort;

public class insertionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {9,6,4,1,5};

        insertionSort in = new insertionSort();
        System.out.println("Mang sau khi sap xep:");
        in.printArray(arr);
        in.sort(arr);
        System.out.println("Mang sau khi sap xep:");

        printArray(arr);
    }
}
