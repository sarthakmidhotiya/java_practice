class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int element = 6;
        
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        
        arr[0] = element;
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}