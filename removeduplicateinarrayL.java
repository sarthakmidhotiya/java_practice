class Main{
    public static void main(String[] args){
        int[] arr = {10,4,2,4,5,2,8};
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                int temp=0;
                temp=arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            }
       }
            for(int i=0; i<arr.length-1; i++){
               if(arr[i] != arr[i+1]){
                   System.out.println(arr[i]);
               }
       }
        
            System.out.println(arr[arr.length-1]);
        
        }
    }
