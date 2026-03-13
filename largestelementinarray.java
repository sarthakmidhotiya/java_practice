class Main{
    public static void main(String[] atgs){
        int[] arr = {1,2,3,48,5};
        int max = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}