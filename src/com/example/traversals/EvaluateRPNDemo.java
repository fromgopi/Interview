/**
 * @Ref: leet-code number 150(Evaluate Reverse Polish Notation)
 * @author: Muktevigk
 * @params: String[] tokens (contains integers and basic operators.)
 * @return: result of the expression.
 */
package com.example.traversals;

public class EvaluateRPNDemo {

    public static void main(String[] args) {

        EvaluateRPN evaluate = new EvaluateRPN();
        
        String[] tokens = {"4", "13", "5", "/", "+"};
        
        int res = evaluate.evalRPN(tokens);
        System.out.println("res = " + res);

    }

}
