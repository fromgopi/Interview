package oops.strings;

import java.util.Arrays;

public class KLengthSubString {

    public int solution(String S, int K) {
        if (K <= 0 || S == null || S.length() < K) {
            return 0;
        }
        int m[] = new int[26];
        Arrays.fill(m, -1);
        int i = 0;
        int res = 0;
        for (int j = 0; j < S.length(); j++) {
            char c = S.charAt(j);
            if (m[c-'a'] != -1) {
                i = Math.max(m[c-'a']+1, i);
            }
            m[c-'a'] = j;
            if (j-i+1 == K) {
                res++;
                i++;
            }
        }
        return res;
    }

}
