class BinarySearch{


  
    static public int search(int[] nums, int target) {
        int lptr=0;
        int rptr=nums.length-1;
        while(lptr<=rptr){
            int mid=(lptr+rptr)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                lptr=mid+1;
            }
            else{
                rptr=mid-1;
            }
        }

        return -1;
    }



    public static void main(String[] args) {
        
    }
}