package com.example.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindAndReplace {


    void find(String S, int[] indexes, String[] sources, String[] targets){

        StringBuilder res = new StringBuilder();

        TreeMap<Integer, String[]> sorted = new TreeMap<>();
        for (int i = 0; i < indexes.length; i++) {
            String[] source_and_target = new String[] {sources[i], targets[i]};
            sorted.put(indexes[i], source_and_target);
        }

        int k = 0;
        for (Map.Entry<Integer, String[]> entry : sorted.entrySet()) {
            int index = entry.getKey();
            String[] comp = entry.getValue();
            String source = comp[0];
            String find = S.substring(index, index+source.length());
            if (find.equals(source)) {
                String target = comp[1];
                String sub = S.substring(k, index);
                res.append(sub);
                res.append(target);
                k = index+source.length();
            }
        }
        if (k < S.length()) res.append(S.substring(k, S.length()));

        System.out.println(res.toString());

    }


    void find(String S, String[] sources, String[] targets, int[] indexes){
        StringBuilder sb = new StringBuilder(S);
        int len = S.length();
        int[] indexValInvert = new int[len];
        Arrays.fill(indexValInvert, -1);
        for (int i = 0; i < indexes.length; ++i) { indexValInvert[indexes[i]] = i; }
        for (int i = len - 1; i >= 0; --i) {
            int j = indexValInvert[i];
            if (j < 0) { continue; }
            if (S.substring(indexes[j]).startsWith(sources[j])) {
                sb.replace(indexes[j], indexes[j] + sources[j].length(), targets[j]);
            }
        }
        System.out.println(sb.toString());
    }

}
