package com.example.arrays;

import java.security.PublicKey;

public class AbsentRecordsII {


    public int calc(int n){

        final int MOD = 1000000007;
        int[][][] f = new int[n + 1][2][3];


        f[0] = new int[][]{{1, 1, 1}, {1, 1, 1}};
        for (int i = 1; i <= n; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 3; k++) {
                    int val = f[i - 1][j][2];
                    if (j > 0) {
                        val = (val + f[i - 1][j - 1][2]) % MOD;
                        System.out.println("val if j > 0= " + val);
                    }
                    if (k > 0) {
                        val = (val + f[i - 1][j][k - 1]) % MOD;
                        System.out.println("val if k > 0= " + val);
                    }

                    f[i][j][k] = val;
                }
        return f[n][1][2];

    }

    public int calculateReward(int n){

        int M = Integer.MAX_VALUE;

        int PorL[] = new int[n+1];
        int P[] = new int[n+1];

        PorL[0] = P[0] = 1;
        PorL[1] = 2;
        P[1] = 1;

        for (int i = 2; i <= n; i++) {
            P[i] = PorL[i - 1];
            PorL[i] = (P[i] + P[i - 1] + P[i - 2]) % M;
        }

        int res = PorL[n];
        for (int i = 0; i < n; i++) {
            int s = (PorL[i] * PorL[n - i - 1]) % M;
            res = (res + s) % M;
        }

        return res;
    }

    public int checkRecord(int n) {
        int[][] A = new int[][]
                {
                        {1, 1, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1, 1},
                        {0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 1, 0}
                };
        A = Pow(A, n + 1);

        return A[3][0];
    }

    private int[][] Mul(int[][] A, int[][] B) {
        int mod = 1000000007;
        int N = A.length;
        int[][] C = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                long t = 0;
                for (int k = 0; k < N; ++k) {
                    t += (long)A[i][k] * B[k][j];
                }
                C[i][j] = (int)(t % mod);
            }
        }
        return C;
    }

    private int[][] Pow(int[][] A, int b) {
        int N = A.length;
        System.out.println("N = " + N);
        int[][] C = new int[N][N];
        for (int i = 0; i < N; ++i) {
            C[i][i] = 1;
        }
        while (b > 0) {
            if (b % 2 == 1) {
                C = Mul(C, A);
            }
            A = Mul(A, A);
            b /= 2;
        }
        return C;

    }

}
