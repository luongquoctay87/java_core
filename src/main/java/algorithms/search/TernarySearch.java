package algorithms.search;

/**
 * Ternary Search - Tìm kiếm tam phân là một kỹ thuật trong khoa học máy tính dùng để tìm kiếm giá trị lớn nhất (maximum)
 * hay nhỏ nhất (minimum) của một unimodal function, và đây cũng là một ví dụ ứng dụng lớp thuật toán Chia để trị (divide and conquer).
 */
public class TernarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = ternarySearch(arr, 4);
        if (result != -1)
            System.out.println("Index: " + result);
        else
            System.out.println("not found");
    }

    static int ternarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (right - left >= 0) {
            int partition = (right - left) / 3;
            int mid1 = left + partition;
            int mid2 = right - partition;

            if (target == arr[mid1])
                return mid1;
            else if (target == arr[mid2])
                return mid2;
            else if (target < arr[mid1])
                right = mid1 - 1;
            else if (target > arr[mid2])
                left = mid2 + 1;
            else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }

        return -1;
    }
}
