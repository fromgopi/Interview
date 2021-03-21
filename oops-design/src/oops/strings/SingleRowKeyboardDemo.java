package oops.strings;

public class SingleRowKeyboardDemo {
    public static void main(String[] args) {
        // String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";

        SingleRowKeyboard obj = new SingleRowKeyboard();
        int result = obj.solution(keyboard, word);
        System.out.println("Time taken to type '"+word+"' is " + result);
    }
}
