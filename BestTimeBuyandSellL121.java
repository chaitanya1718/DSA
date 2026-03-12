import java.util.*;
public class BestTimeBuyandSellL121 {

    static int brute_max_profit(int[] arr){
        int maxProfit=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int currProfit=arr[j]-arr[i];
                maxProfit=Math.max(currProfit,maxProfit);
            }
        }
        return maxProfit;

    }
     static int optimal_max_profit(int[] arr){
        int maxProfit=0;
        int lptr=0;
        int rptr=1;
        for(;rptr<arr.length;rptr++){
            int currProfit=arr[rptr]-arr[lptr];
            maxProfit=Math.max(maxProfit, currProfit);
           if(arr[rptr]<=arr[lptr]){
            lptr++;
           }
        }
        return maxProfit;
    }
    static int better_max_profit(int[] arr){
        int maxProfit=0;
        int lptr=0;
        int minPrice=arr[0];
        for(int i=1;i<arr.length;i++){
            int currProfit=arr[i]-minPrice;
            
            minPrice=Math.min(arr[i],minPrice);

        }
    }

    


    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(brute_max_profit(arr));
        System.out.println(optimal_max_profit(arr));



    }
    
}
