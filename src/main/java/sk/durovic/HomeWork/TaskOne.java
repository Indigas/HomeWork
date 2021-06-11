package sk.durovic.HomeWork;

import java.util.Stack;

public class TaskOne {

    public static int checkParentheses(String str){
        Stack<Character> stack = new Stack<>();

        char[] c = str.toCharArray();

        for(int j = 0; j < c.length; j++){
            char current=c[j];
            if(current == '(' || current =='[' || current == '{'){
                stack.push(current);
                continue;
            }

            char check;
            switch (current){
                case ')' :
                    check = stack.pop();
                    if(check == '{' || check == '[')
                        return 0;
                    break;

                case ']' :
                    check = stack.pop();
                    if(check == '(' || check == '{')
                        return 0;
                    break;

                case '}' :
                    check = stack.pop();
                    if(check == '[' || check == '(')
                        return 0;
                    break;

                default : break;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
