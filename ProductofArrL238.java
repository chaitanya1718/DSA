import java.util.Arrays;

class ProductofArrL238 {

    static int[] brute_product_arr(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= arr[j];
                }
            }
            ans[i] = prod;
        }
        return ans;
    }

    static int[] div_product_arr(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod *= arr[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = prod / arr[i];
        }
        return ans;
    }

    static int[] better_product_arr(int[] arr) {
        int n = arr.length;
        // return if array length is 1
        if (n == 1 || n==0) {
            return new int[] { 1 };
        }

        // answer arr
        int[] ans = new int[n];

        // prefix and postfix products
        int prefix[] = new int[n];
        int postfix[] = new int[n];


        int prefix_int = 1;
        int postfix_int = 1;

        // initializing prefix and postfix first and last elements
        prefix[0] = arr[0];
        postfix[n - 1] = arr[n - 1];

        // calculating prefix and postfix
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i];
            postfix[n - i - 1] = postfix[n - i] * arr[n - i - 1];
        }

        // storing answer
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[i] = prefix_int * postfix[i + 1];
            } else if (i == n - 1) {
                ans[i] = postfix_int * prefix[i - 1];
            } else {
                ans[i] = prefix[i - 1] * postfix[i + 1];
            }
        }

        return ans;
    }

    static int[] optimal_product_arr(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        
        // pass 1 prefix product
       int prefix=1;
        for(int i=0;i<n;i++){
            ans[i]=prefix;
            prefix=prefix*arr[i];
        }

        // pass2 postfix 
        int postfix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=postfix*ans[i];
            postfix=postfix*arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = brute_product_arr(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(better_product_arr(arr)));
        System.out.println(Arrays.toString(optimal_product_arr(arr)));

    }
}