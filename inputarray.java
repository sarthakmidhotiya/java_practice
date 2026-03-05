import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] karan = new int[7];
        System.out.println("Enter array: ");
        for(int i=0; i<7; i++){
            
            karan[i] = sc.nextInt();
            
        }
        for(int i=0; i<7; i++){
            System.out.println(karan[i]);
        }
    }
}