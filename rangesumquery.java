import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.println("enter the left index: ");
        int L = sc.nextInt();
        System.out.println("enter the right index: ");
        int R = sc.nextInt();
        int sum = 0;
        
        for(int i=L; i<=R; i++){
            sum = sum + arr[i];
            arr[i] = sum;
        }
        
            System.out.println(sum);
        
    }
}