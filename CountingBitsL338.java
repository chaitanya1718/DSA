public class CountingBitsL338 {


    static  int hammingWeight(int n){
        int ans=0;
        while(n!=0){
            n=n&(n-1);
            ans++;
        }
        return ans;
    }

    static int[] brute_countBits(int n) {
        int arr[]=new int[n+1];

        for(int i=0;i<n+1;i++){
            int currSetBits=hammingWeight(i);
            arr[i]=currSetBits;
        }
        return arr;
    }

    static int[] optimal_countBits(int n){

        int[] dp=new int[n+1];
        int offset=1;

        for(int i=0;i<=n;i++){
            if(offset*2==i){
                offset=i;
            }
            dp[i]=1+(i-offset);
        }

        return dp;

    }

    public static void main(String[] args) {
        
    }

}
