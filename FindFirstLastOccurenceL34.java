public class FindFirstLastOccurenceL34 {


    static int[] searchRange(int[] nums, int target) {
        int x=searchFirst(nums,target);
        if(x==-1 || nums[x]!=target){
            return new int[]{-1,-1};
        }
        int y=searchLast(nums,target)-1;
        return new int[]{x,y};
    }

    static int searchFirst(int[]nums, int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    static int searchLast(int[]nums, int target){
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }





    public static void main(String[] args) {
        
    }
}
