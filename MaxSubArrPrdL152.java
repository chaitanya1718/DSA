class MaxSubArrPrdL152{

    static int brute_max_product(int[] arr) {
        int max_product = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int currProduct = 1;
            for (int j = i; j < n; j++) {
                currProduct *= arr[j];
                max_product = Math.max(currProduct, max_product);
            }
        }
        return max_product;
    }

    static int optimal_max_product(int[] arr){
        int max_product=Integer.MIN_VALUE;
        int n=arr.length;
        int curr_min=1;
        int curr_max=1;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                max_product = Math.max(max_product, 0);
                curr_min=1;
                curr_max=1;
                continue;
            }
            int temp=curr_min;
            curr_min=Math.min(arr[i],Math.min(arr[i]*curr_min,arr[i]*curr_max));
            curr_max=Math.max(arr[i],Math.max(arr[i]*curr_max,arr[i]*temp));
            max_product=Math.max(curr_max,max_product);
        }
        return max_product;
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,-1};
        System.out.println(brute_max_product(arr));
        System.out.println(optimal_max_product(arr));
    }
}