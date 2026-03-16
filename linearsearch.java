class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int find = 7;
        
        for(int i=0;i<arr.length;i++){
            if(find == arr[i]){
                System.out.println(i);
            }else{
                System.out.println("not present");
                break;
            }
        }
        
    }
}