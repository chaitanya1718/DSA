import java.util.HashMap;
import java.util.Scanner;

class TwosumL1{

    static int[] brute_two_sum(int[] arr,int target){
        int[] ans={-1,-1};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }

    static int[] better_tc_approach(int[] arr,int target){
        int[] ans={-1,-1};
        HashMap<Integer,Integer>mpp=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(mpp.containsKey(target-arr[i])){
                ans[0]=mpp.get(target-arr[i]);
                ans[1]=i;
                break;
            }
            mpp.put(arr[i],i);
        }
        return ans;
    }

    static int[] better_sc_approach(int[] arr,int target){
        int[] ans={-1,-1};
        
        int rptr=arr.length-1;
        int lptr=0;
        while(lptr<rptr){
            if(arr[lptr]+arr[rptr]==target){
                ans[0]=lptr;
                ans[1]=rptr;
                return ans;
            }
            else if(arr[lptr]+arr[rptr]>target){
                rptr--;
            }
            else{
                lptr++;
            }
        }

        return ans;
        
    }




    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        int[] arr={1,2,3,4,6,8};
        int target=4;
        System.out.println(brute_two_sum(arr,target)[0]+" " +brute_two_sum(arr, target)[1]);;
        System.out.println(better_tc_approach(arr, target)[0]+" " +better_tc_approach(arr, target)[1]);
        System.out.println(better_sc_approach(arr, target)[0]+" " +better_sc_approach(arr, target)[1]);

    }
}