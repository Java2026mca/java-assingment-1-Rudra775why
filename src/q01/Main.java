import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: Print a hollow diamond pattern of half-height n using '*'
        //
        // Rules:
        //   - Only border cells have '*', inside is spaces
        //   - No trailing spaces on any line
        //
        // Input: 4
        // Output:
        //    *
        //   * *
        //  *   *
        // *     *
        //  *   *
        //   * *
        //    *
        
        int n = 4;

        for (int i = 0; i <= n; i++) {

            // print spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }

            int val = 1; // first value in every row is always 1

            for (int j = 0; j <= i; j++) {
                System.out.print(val + "    ");

                // update value using optimized formula
                val = val * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
