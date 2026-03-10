class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arrL = new int[arr.length];
        int[] arrR = new int[arr.length];
        int sum = 0;
         
        for(int i=0; i<arr.length; i++){
            sum = sum + arrL[i];
            arrL[i] = sum;
        }
        for(int i=arr.length; i<=0; i--){
            sum = sum + arrL[i];
            arrR[i] = sum;
        }
        for(int i=0; i<arr.length; i++){
            if(arrL[i] == arrR[i]){
                ans = 1;
            }
        }
        
    }
}