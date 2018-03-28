/**
* @author
 * */

package com.example.com.example.general;

import java.util.LinkedList;
import java.util.List;

public class LetterCombination {

    public List<String> letterCombination(String digits){

        LinkedList<String> ans = new LinkedList<String>();

        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        ans.push("");

        for(int i=0;i<digits.length();i++){
            int ch = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length() == i){
                String t = ans.remove();
                for(char s : mapping[ch].toCharArray()){
                    ans.add(t+s);
                }
            }
        }

        return ans;
    }

}
