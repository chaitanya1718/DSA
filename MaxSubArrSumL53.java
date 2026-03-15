class MaxSubArrSumL53{


    static int brute_max_sum(int[] arr){
        int n=arr.length;
        int max_sum=Integer.MIN_VALUE;

        // outer loop (to iterate over each element)
        for(int i=0;i<n;i++){

            // this loop to iterate from i till n elemtns
            for(int j=i;j<n;j++){

                int curr_sum=0;
                // this loop to iterate from sub array startin pnt till sub array end
                for(int k=i;k<=j;k++){
                    curr_sum=curr_sum+arr[k];
                }
                // update max sum if curr_sum > max sum
                max_sum=Math.max(curr_sum,max_sum);
            }
        }



        return max_sum;
    }

    
    static int brute_imp_max_sum(int[] arr){
        int n=arr.length;
        int max_sum=Integer.MIN_VALUE;

        // outer loop (to iterate over each element)
        for(int i=0;i<n;i++){

            int curr_sum=0;
            // this loop to iterate from i till n elemtns
            for(int j=i;j<n;j++){
                curr_sum=curr_sum+arr[j];
                // update max sum if curr_sum > max sum
                max_sum=Math.max(curr_sum,max_sum);
            }
        }
        return max_sum;
    }

    static int opimal_max_sum(int[] arr){
        int n=arr.length;
        int max_sum=arr[0];
        int curr_sum=0;

        for(int i=0;i<n;i++){
            if(curr_sum<0){
                curr_sum=0;
            }
            curr_sum+=arr[i];
            max_sum=Math.max(max_sum,curr_sum);

        }
        return max_sum;
    }



    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(brute_max_sum(arr));
        System.out.println(opimal_max_sum(arr));
        
    }
}