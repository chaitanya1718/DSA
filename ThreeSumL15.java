import java.util.*;
class ThreeSumL15{

    static List<List<Integer>> thrsum(int[] arr){
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
           if(i>0 && arr[i]==arr[i-1]){
            continue;
           }
           int r=n-1;
           int l=i+1;
           while(l<r){
            int threesum=arr[l]+arr[r]+arr[i];
            if(threesum>0){
                r--;
            }
            else if(threesum<0){
                l++;
            }
            else{
                res.add(Arrays.asList(arr[i],arr[l],arr[r]));
                l++;
                r--;
                while(l<r && arr[l]==arr[l-1]){
                    l++;
                }
                 while(l<r && arr[r]==arr[r+1]){
                    r--;
                }
            }
           }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        List<List<Integer>> res=thrsum(arr);

        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }
}