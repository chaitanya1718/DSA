import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicateL217 {

   static boolean brute_contains_duplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean better_contains_duplicate(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

    static boolean optimal_contains_duplicate(int[] arr){
        HashSet<Integer>st=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i])){
                return true;
            }
            st.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,23,2,1};
        System.out.println(brute_contains_duplicate(arr));
        System.out.println(better_contains_duplicate(arr));
        System.out.println(optimal_contains_duplicate(arr));
    }
}
