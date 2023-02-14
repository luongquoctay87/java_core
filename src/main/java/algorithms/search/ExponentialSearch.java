package algorithms.search;

/**
 * Tim kiem tam phan
 * https://codelearn.io/sharing/5-thuat-toan-tim-kiem-moi-ltv-nen-biet
 */
public class ExponentialSearch extends BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = expoSearch(arr, 4);
        if (result != -1)
            System.out.println("Index: " + result);
        else
            System.out.println("not found");
    }

    static int expoSearch(int[] a, int target) {
        int bound = 1;
        while (bound < a.length && target > a[bound])
            bound *= 2;

//		This below while loop does the same job
//		while ( bound < a.length) {
//			if ( target <= a[bound] ) {
//				break;
//			}
//			else {
//				bound = bound * 2;
//			}
//		}

        int left_bound = bound / 2;
        int right_bound = Math.min(bound, a.length - 1);
        int answer = binarySearch(a, left_bound, right_bound, target);
        return answer;
    }
}
