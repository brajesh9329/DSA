public class arrPractice {

    public static void sortColors(int[] nums) {

        int n=nums.length;
        int low=0 ,mid=0 ,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                low++;
                mid++;

            }else if(nums[mid]==1){
                mid++;


            }else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;

            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

        }
    }

    public static void main(String[] args) {

        int[] arr={2,0,1,1,2,0};
        sortColors(arr);
    }
}
