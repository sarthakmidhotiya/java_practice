class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1 = new int[arr.length];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            arr1[i] = sum;
            System.out.println(arr1[i]);
        }
        
    }
}