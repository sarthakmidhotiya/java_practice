import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9};
        int target = 11;
        boolean found = false;


       for(int i=0; i<nums.length; i++){
           for(int j=i+1; j<nums.length; j++){
               if(nums[i] + nums[j] == target){
                   System.out.println("[" + i + "," + j + "]");
                   found = false;
                   
               }
           }
        //    break;
       }
    }
}