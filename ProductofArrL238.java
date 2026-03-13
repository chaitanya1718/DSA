import java.util.Arrays;

class ProductofArrL238{

    static int[] brute_product_arr(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    prod*=arr[j];
                }
            }
            ans[i]=prod;
        }
        return ans;
    }

    static int[] div_product_arr(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int prod=1;
        for(int i=0;i<n;i++){
            prod*=arr[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=prod/arr[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] ans=brute_product_arr(arr);
        System.out.println(Arrays.toString(ans));
        
        
    }
}