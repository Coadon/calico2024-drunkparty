import java.io.*;

class Solution {
    /**
     * Return the shape of displayed by ASCII string G of dimensions N x M
     *
     * G: a string representing an ASCII picture
     * N: integer for number of rows
     * M: integer for number of columns
     */
    static String solve(int N, int M, String[] G) {
        // YOUR CODE HERE
        boolean triangle = false;

        for (int i = 0; i < M - 1; i++) {
            // check if there is a hashtag
            if (G[i].contains("#")) {
                // if the next
                if (G[i + 1].equals(G[i]) || !(G[i + 1].contains("#"))) {
                    triangle = false;
                    return "ferb";
                } else {
                    triangle = true;
                    return "phineas";
                }
            }
        }

        if (triangle) {
            return "phineas";
        } else {
            return "ferb";
        }

    }

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            String[] dimensions = in.readLine().split(" ");
            int N = Integer.parseInt(dimensions[0]), M = Integer.parseInt(dimensions[1]);
            String[] G = new String[N];
            for (int j = 0; j < N; j++) {
                String row = in.readLine();
                G[j] = row;
            }
            out.println(solve(N, M, G));
        }
        out.flush();
    }
}