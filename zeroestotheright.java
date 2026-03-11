import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the values: ");
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("now seperating the zeroes!");
        
        
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            
        }
        for(int i: arr){
            System.out.println(i);
        }
        
    
        
    }
}