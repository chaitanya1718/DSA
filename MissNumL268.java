import java.util.Arrays;
import java.util.HashSet;

public class MissNumL268 {

    static int brute_miss_num(int[] arr){

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
            
        }
        return -1;
    }
    

    static int better_miss_num(int[] arr){
        HashSet<Integer>mp=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            mp.add(arr[i]);
        }

        for(int i=0;i<=arr.length;i++){
            if(!mp.contains(arr[i])){
                return arr[i];
            }
        }
        return -1;
    }

    static int optimal_miss_number(int[] arr){
        long eleSum=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            eleSum+=arr[i];
        }

        long totalSum=(long)n*(n+1)/2;
        return (int)(totalSum-eleSum);

    }

    static int optimal_miss_number_xor(int[] arr){
        int xor1=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            xor1=xor1^arr[i];
            xor1=xor1^i;
        }
        return xor1^n;
    }


    public static void main(String[] args) {
        
    }
}
