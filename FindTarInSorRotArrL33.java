public class FindTarInSorRotArrL33 {

    static int optimal_find_target(int[] arr,int target){

        int r=arr.length-1;
        int l=0;

        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                return mid;
            }
            // mid belongs to left sorted
            if(arr[mid]>=arr[l]){
                // if tagret greater than mid element search right
                if(target>arr[mid]){
                    l=mid+1;
                }
                // search right
                else if(target<arr[l]){
                    l=mid+1;
                }
                // search left
                else{
                    r=mid-1;
                }
            }
            // mid belongs to right sorted
            else{
                // if traget less than mid element, search left
                if(target<arr[mid]){
                    r=mid-1;
                }
                // search left
                else if(target>arr[mid]){
                    r=mid-1;
                }
                // search right
                else{
                    l=mid+1;
                }

            }

        }


        return -1;
    }

    
    
    public static void main(String[] args) {
        
    }
}
