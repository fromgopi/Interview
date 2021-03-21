package oops.strings;

public class KLengthSubStringDemo {
    public static void main(String[] args) {
        
        String S = "havefunonleetcode";
        int K = 5;

        KLengthSubString obj = new KLengthSubString();
        int res = obj.solution(S, K);
        System.out.println(res);
    }
}
