import java.util.Scanner;

public class MaxScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Reading array elements
            }
            int result = getMaxScore(n, arr); // Calculate max score
            System.out.println(result);
        }
        sc.close(); // Close scanner
    }

    static int getMaxScore(int n, int[] arr) {
        // dp[i][0] = max score up to index i without coloring the i-th element
        // dp[i][1] = max score up to index i with coloring the i-th element
        int[][] dp = new int[n + 1][2];
        
        // Base case initialization
        dp[0][0] = 0; // No elements
        dp[0][1] = 0; // Impossible state, not used

        for (int i = 1; i <= n; i++) {
            int value = arr[i - 1]; // Current value

            // If not coloring the i-th element
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);

            // If coloring the i-th element
            dp[i][1] = dp[i - 1][0] + value + 1; // Color the current element
        }

        // The maximum score will be the best of either coloring or not coloring the last element
        return Math.max(dp[n][0], dp[n][1]);
    }
}
