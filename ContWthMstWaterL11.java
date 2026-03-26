public class ContWthMstWaterL11 {
    static int brute_maxArea(int[] arr) {
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int area=(j-i)*Math.min(arr[i],arr[j]);
                max=Math.max(area,max);
            }
        }
        return max;
    }

    static int opt_maxArea(int[] arr){
        int max=0;

        int l=0;
        int r=arr.length-1;

        while(l<r){
            int area=(r-l)*Math.min(arr[l],arr[r]);
            max=Math.max(area,max);
            if(arr[l]<arr[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};

        System.out.println(opt_maxArea(arr));
    }
}
