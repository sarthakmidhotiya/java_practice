import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Put the size of array: ");
        int n  = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Array elements: ");
        
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(array[i]);
        // }
        
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of array is: " + sum);
    }
}