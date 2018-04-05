/**
 * @Ref: leet-code number 744(Find Smallest Letter Greater Than Target)
 * @author: Muktevigk
 * @params: char[] letters, char x(target char)
 * @return: smallest element in the list that is larger than the given target
 */

package com.example.strings;

public class GreatestElementDemo {

    public static void main(String[] args) {
        char[] alphabets = {'c','a','f'};
        char target = 'a';

        GreatestElement ge = new GreatestElement();
        
        char res = ge.getGreatestElement(alphabets, 'c');
        System.out.println("res = " + res);

    }

}
