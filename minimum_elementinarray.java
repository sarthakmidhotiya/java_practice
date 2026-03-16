import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    int[] arr = {1,2,3,10,-1,5,6,9,-2};
    int min = arr.length;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    System.out.println(min);
    }
}