import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // remove out of window
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }

            // remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offer(i);

            // print result
            if (i >= k - 1) {
                System.out.print(arr[dq.peek()] + " ");
            }
        }
    }
}