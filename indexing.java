public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("First element: " + arr[0]);
        System.out.println("Second element: " + arr[1]);
        System.out.println("Last element: " + arr[arr.length - 1]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " -> " + arr[i]);
        }
    }
}