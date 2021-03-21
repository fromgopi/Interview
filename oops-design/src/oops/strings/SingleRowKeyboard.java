package oops.strings;

import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyboard {

    public int solution(String keyboard, String word){
        int time = 0;
        int charIndex = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : keyboard.toCharArray()){
            map.put(ch, charIndex++);
        }

        for (int i = 0, currentIndex = 0; i <word.length(); i++) {
            int nextIndex = map.get(word.charAt(i));
            time += Math.abs(currentIndex - nextIndex);
            currentIndex = nextIndex;
        }
        return time;
    }

}
