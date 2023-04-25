package com.greatlearning.BalancingBrackets;

import java.util.*;

public class BalancingBrackets {
    public static boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : brackets.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // unbalanced
            }
        }
        return stack.isEmpty(); // true if stack is empty (balanced)
    }

    public static void main(String[] args) {
        String brackets1 = "[]{()}";
      
        System.out.println(brackets1 + " is balanced: " + isBalanced(brackets1));
        
    }
}
