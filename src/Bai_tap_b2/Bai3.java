package Bai_tap_b2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class Bai3 {
    static final int MOD = 1000000007;
    static int[][][][][] dp = new int[32][32][6][2][2];
    static int[] powerOfTwo = new int[32];
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < 32; i++) {
            powerOfTwo[i] = 1 << i;
        }
        int t = Integer.parseInt(reader.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine().trim());
            int[] A = new int[n];
            int[] B = new int[n];
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
            int[] curr = new int[32];
            curr[0] = 1;
            for (int i = 0; i < n; i++) {
                clearDP();
                dp[0][0][0][0][0] = 1;
                for (int j = 0; j <= 29; j++) {
                    int p = 29 - j;
                    int bitMaskA = A[i] & powerOfTwo[p];
                    int bitMaskB = B[i] & powerOfTwo[p];
                    for (int k = 0; k <= 29; k++) {
                        for (int type = 0; type < 6; type++) {
                            for (int good = 0; good < 2; good++) {
                                for (int low = 0; low < 2; low++) {
                                    if (dp[j][k][type][good][low] == 0)
                                        continue;
                                    for (int bit = 0; bit < 2; bit++) {
                                        if (low == 0 && bitMaskB == 0 && bit == 1)
                                            continue;
                                        if (bit == 0) {
                                            int good2 = good | (bitMaskA != 0 ? 1 : 0);
                                            int low2 = low | (bitMaskB != 0 ? 1 : 0);
                                            dp[j + 1][k][type][good2][low2] =
                                                    (dp[j + 1][k][type][good2][low2] + dp[j][k][type][good][low]) % MOD;
                                        } else {
                                            int bita = good | (bitMaskA != 0 ? 1 : 0);
                                            int k2 = (type == 0) ? 0 : k + 1;
                                            int type2 = determineType(type, bita);
                                            dp[j + 1][k2][type2][good][low] =
                                                    (dp[j + 1][k2][type2][good][low] + dp[j][k][type][good][low]) % MOD;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] count = new int[32];
                for (int k = 0; k <= 29; k++) {
                    for (int good = 0; good < 2; good++) {
                        for (int low = 0; low < 2; low++) {
                            count[0] = (count[0] + dp[30][k][0][good][low]) % MOD;
                            count[1] = (count[1] + dp[30][k][1][good][low]) % MOD;
                            count[k + 1] = (count[k + 1] + dp[30][k][2][good][low]) % MOD;
                            count[0] = (count[0] + dp[30][k][3][good][low]) % MOD;
                            count[k + (k % 2 == 1 ? -1 : 1)] =
                                    (count[k + (k % 2 == 1 ? -1 : 1)] + dp[30][k][4][good][low]) % MOD;
                            count[k + 1] = (count[k + 1] + dp[30][k][5][good][low]) % MOD;
                        }
                    }
                }
                count[0]--;
                int[] next = new int[32];
                for (int j = 0; j < 32; j++) {
                    for (int k = 0; k < 32; k++) {
                        next[j ^ k] = (int)((next[j ^ k] + (1L * curr[j] * count[k] % MOD)) % MOD);
                    }
                }
                curr = next;
            }
            out.println(curr[0]);
        }
        out.flush();
    }
    private static void clearDP() {
        for (int[][][][] d1 : dp)
            for (int[][][] d2 : d1)
                for (int[][] d3 : d2)
                    for (int[] d4 : d3)
                        for (int j = 0; j < d4.length; j++)
                            d4[j] = 0;
    }
    private static int determineType(int type, int bita) {
        if (bita != 0) {
            return switch (type) {
                case 0 -> 1;
                case 1, 2 -> 2;
                default -> 5;
            };
        } else {
            return switch (type) {
                case 0 -> 0;
                case 1, 4 -> 4;
                case 2 -> 3;
                default -> 5;
            };
        }
    }
}

