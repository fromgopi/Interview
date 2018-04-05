/**
 * @Ref: leet-code number 224(Basic Calculator)
 * @author: Muktevigk
 * @params: String expression.
 * @return: Calculated result.
 */

package com.example.traversals;

public class BasicCalculatorDemo {

    public static void main(String[] args) {
        String exp = "(1+(4+5+2)+3)+(6+8)";

        BasicCalculator bc = new BasicCalculator();

        int res = bc.calculate(exp);
        System.out.println("res = " + res);
    }
}
