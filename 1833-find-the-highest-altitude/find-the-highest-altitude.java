class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + gain[i - 1];

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[0] > max) {
                max = arr[0];
            }
        }

        return max;
    }
}