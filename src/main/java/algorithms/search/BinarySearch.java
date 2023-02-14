package algorithms.search;

// Thuật toán Binary Serach (Tìm kiếm nhị phân) là một thuật toán tìm kiếm tuyến tính cao cấp hơn với thời gian chạy là O(logN)
// https://niithanoi.edu.vn/binary-search.html
public class BinarySearch {
    // Trả về chỉ mục của x nếu nó có trong arr[l..right]
    // ngược lại trả về -1
    static int binarySearch(int[] arr, int left, int right, int searchValue) {
        if (right >= left) {
            int middle = left + (right - left) / 2;

            // Nếu phần tử có ở chính giữa
            if (arr[middle] == searchValue)
                return middle;

            // Nếu phần tử nhỏ hơn giữa, thì nó chỉ có thể
            // hiện diện trong mảng con bên trái
            if (arr[middle] > searchValue)
                return binarySearch(arr, left, middle - 1, searchValue);

            // Ngược lại, phần tử chỉ có thể có mặt
            // trong mảng con bên phải
            return binarySearch(arr, middle + 1, right, searchValue);
        }

        // Nếu phầnt tử không có trong mảng
        return -1;
    }

    int binarySearch(int[] arr, int searchValue) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            // kiểm tra xem x có ở chính giữa không
            if (arr[middle] == searchValue)
                return middle;

            // Nếu x lớn hơn, bỏ qua nửa bên trái
            if (arr[middle] < searchValue)
                left = middle + 1;

                // Nếu x nhỏ hơn, bỏ qua nửa bên phải
            else
                right = middle - 1;
        }

        // phần tử không tồn tại
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int[] arr = {2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86};
        int length = arr.length;
        int searchValue = 10;
        int result = ob.binarySearch(arr, 0, length - 1, searchValue);
        if (result == -1)
            System.out.println("Phần tử không tồn tại.");
        else
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);

        System.out.println("===============[Option 2]============================");

        result = ob.binarySearch(arr, searchValue);
        if (result == -1)
            System.out.println("Phần tử không tồn tại.");
        else
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
    }
}
