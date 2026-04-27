class SumOfDistancesL2615{

    // O(n^2) solution
    //brute force
    static long[] brute_distance(int[] nums) {

        int n=nums.length;
        long res[]=new long[n];

        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(nums[i]==nums[j]){
                    sum+=Math.abs(i-j);
                }
            }
            res[i]=sum;
        }

        return res;
        
    }

    // optimal


    public static void main(String[] args) {
        
    }
}
