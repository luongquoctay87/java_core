package algorithms.search;
/*
* Exponential Search là một cải tiến so với tìm kiếm nhị phân. Nó hoạt động trên một mảng được sắp xếp nhất định.
* Thay vì thực hiện tìm kiếm nhị phân trên toàn bộ tập dữ liệu, chúng ta tìm một khối có giá trị đích và sau đó thực hiện tìm kiếm nhị phân trong khối nhỏ đó.
* Để tìm khối, chúng ta lấy chỉ số (1) và kiểm tra giá trị của nó với giá trị đích. Nếu mục tiêu nhiều hơn giá trị chỉ mục này,
* thì chúng ta nhân đôi độ dài của khối hiện tại và kiểm tra chỉ mục (2) và tiếp tục làm điều này cho chỉ mục (4), (8), (16), v.v.
* cho đến khi tìm ra khối thích hợp. Vì toàn bộ hoạt động của khối này xảy ra trong 1–2–4–8–16-…, đó là lý do tìm kiếm này được gọi là tìm kiếm theo cấp số nhân.
 */
public class JumpSearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = jumpSearch(arr, 4);
        if (result != -1)
            System.out.println("Index: " + result);
        else
            System.out.println("not found");
    }

    static int jumpSearch(int[] arr, int target) {
        int blockSize = (int) Math.sqrt(arr.length);
        int start = 0;
        int next = blockSize;

        while (start < arr.length && target > arr[next - 1]) {
            start = next;
            next = next + blockSize;

            if (next >= arr.length)
                next = arr.length;
        }

        for (int i = start; i < next; i++) {
            if (target == arr[i])
                return i;
        }

        return -1;
    }
}
