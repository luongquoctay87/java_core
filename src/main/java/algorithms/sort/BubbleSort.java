package algorithms.sort;

// Bubble Sort (Sắp xếp nổi bọt) là một thuật toán sắp xếp đơn giản, với thao tác cơ bản là so sánh hai phần tử kề nhau, nếu chúng chưa đứng đúng thứ tự thì đổi chỗ (swap).
// https://niithanoi.edu.vn/bubble-sort.html
public class BubbleSort {

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {5, 1, 4, 2, 8};
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }

    // Hàm sắp xếp nổi bọt
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // In các phần tử của arr
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
