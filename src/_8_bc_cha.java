import java.util.*;

    class ChocolateDistribution {
        public static int findMinDifference(ArrayList<Integer> arr, int m) {

            // Sort array list
            Collections.sort(arr);

            // Initialize min value has infinity
            int minDiff = Integer.MAX_VALUE;

            // Traverse the array in windows of size m
            for (int i = 0; i <= arr.size() -m; i++) {
                int diff = arr.get(i + m - 1) - arr.get(i);
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }

            return minDiff;
        }

        public static void main(String[] args) {
            ArrayList<Integer> packets = new ArrayList<>(
                    Arrays.asList(12, 4, 7, 9)
            );

            int m = 3;

            int result = findMinDifference(packets, m);
            System.out.println("Minimum difference is: " + result);
        }
    }


