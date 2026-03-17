public class FindMinInSorRtdArrL153 {

    static int brute_find_min(int[] arr) {

        int n = arr.length;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;

    }

    static int binary_find_min(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int min = arr[0];

        while (l <= r) {
            if (arr[l] < arr[r]) {
                min = Math.min(min, arr[l]);
                break;
            }
            int mid = (l + r) / 2;
            min = Math.min(arr[mid], min);
            // if mid belpongs to left side
            if (arr[mid] >= arr[l]) {
                // search right side
                l = mid + 1;
            }
            // if mid belongs to right side
            else {
                // search left side
                r = mid - 1;
            }
        }

        return min;

    }

    static int binary_find_min_wth_duplicates(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int min = arr[0];

        while (l <= r) {
            if (arr[l] < arr[r]) {
                min = Math.min(min, arr[l]);
                break;
            }
            int mid = (l + r) / 2;
            min = Math.min(arr[mid], min);

            // 🔥 handle duplicates
            if (arr[l] == arr[mid] && arr[mid] == arr[r]) {
                l++;
                r--;
            }
            // if mid belpongs to left side
            else if (arr[mid] >= arr[l]) {
                // search right side
                l = mid + 1;
            }
            // if mid belongs to right side
            else {
                // search left side
                r = mid - 1;
            }
        }

        return min;

    }

    public static void main(String[] args) {

        int[] arr={3,4,5,1,2};
        System.out.println(brute_find_min(arr));
        System.out.println(binary_find_min(arr));

    }
}
