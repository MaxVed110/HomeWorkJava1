//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]

public class remove_element {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3};
        int k = removeElement(nums, 3);
        System.out.println(k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
