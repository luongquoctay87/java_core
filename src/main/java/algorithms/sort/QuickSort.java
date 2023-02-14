package algorithms.sort;

// Thuật toán Quick Sort (Sắp xếp nhanh) còn có một tên gọi khác là sắp xếp phân chia (Part Sort).
// https://niithanoi.edu.vn/quick-sort.html
// Độ phức tạp thời gian của O(nLogn)
public class QuickSort {
    public static void main(String args[]) {
        int arr[] = { 10, 80, 80, 30, 90, 40, 50, 70 };
        int n = arr.length;

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int index = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {

            // Nếu phần tử hiện tại nhỏ hơn chốt
            if (arr[j] < pivot) {
                index++;

                // swap arr[i] và arr[j]
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] và arr[high] (hoặc pivot)
        int temp = arr[index + 1];
        arr[index + 1] = arr[high];
        arr[high] = temp;

        return index + 1;
    }

    // arr[] --> Mảng cần được sắp xếp,
    // low --> chỉ mục bắt đầu,
    // high --> chỉ mục kết thúc
    void sort(int arr[], int low, int high) {
        if (low < high) {

            // pi là chỉ mục của chốt, arr[pi] vị trí của chốt
            int pivot = partition(arr, low, high);

            // Sắp xếp đệ quy các phần tử
            // trướcphân vùng và sau phân vùng
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
