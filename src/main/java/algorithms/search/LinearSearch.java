package algorithms.search;

/**
 * Đây là thuật toán đơn giản nhất trong tất cả các thuật toán tìm kiếm. Trong kiểu tìm kiếm này,
 * một hoạt động tìm kiếm liên tiếp được diễn ra qua tất cả từng phần tử. Mỗi phần tử đều được kiểm tra
 * và nếu tìm thấy bất kỳ kết nối nào thì phần tử cụ thể đó được trả về;
 * nếu không tìm thấy thì quá trình tìm kiếm tiếp tục diễn ra cho tới khi tìm kiếm hết dữ liệu.
 */
public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {13, 42, 41, 61, 26};
        int result = linearSearch(arr, 41);
        if (result != -1)
            System.out.println("Index: " + result);
        else
            System.out.println("not found");
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
