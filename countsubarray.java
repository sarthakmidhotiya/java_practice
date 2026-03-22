class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1};
        int k = 4;

        int left = 0, sum = 0, count = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            count += (right - left + 1);
        }

        System.out.println(count);
    }
}