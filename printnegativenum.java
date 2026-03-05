import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();
        int[] karan = new int[n];
        System.out.println("enter values: ");
        
        for(int i=0; i<n; i++){
            karan[i] = sc.nextInt();
        }
        System.out.println("Print only negative numbers: ");
        int count = 0;
        
        for(int i=0;i<n;i++){
            if(karan[i] < 0){
                count++;
            }
        }
        if(count==0){
            System.out.println("no negative number found");
        }else{
             System.out.println("negative number are: ");
        }
        for(int i=0;i<n;i++){
            if(karan[i] < 0){
                System.out.println(karan[i]);
            }
        }
        
    }
}