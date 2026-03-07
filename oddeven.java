import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers are:");
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        System.out.println("Odd numbers are:");
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}