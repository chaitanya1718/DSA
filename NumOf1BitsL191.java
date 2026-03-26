public class NumOf1BitsL191 {

    static int brute_hammingweight(int n){
         int count=0;
        while(n>0){
            int a=n%2;
            if(a==1){
                count++;
            }
             n/=2;
        }
        return count;
    }
     static int hammingWeight(int n){
        int ans=0;
        while(n!=0){
            ans+=n%2;
            n=n>>1;
        }

        return ans;
     }

     static int optimal_hammingWeight(int n){
        int ans=0;
        while(n!=0){
            n=n&(n-1);
            ans++;
        }
        return ans;
     }


    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}
