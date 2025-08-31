import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Integer.MIN_VALUE;
        boolean[] result = new boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            int newCandies = candies[i] + extraCandies;
            if (newCandies >= maxCandies) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        List<Boolean> output = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            output.add(result[i]);
        }

        return output;
    }
}
