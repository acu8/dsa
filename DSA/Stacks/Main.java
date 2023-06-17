package Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack);
        // var top = stack.pop();
        // System.out.println(top);
        // System.out.println(stack);

        String str = "abcd";
        String[] strArray = str.split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < strArray.length; i++) {
            stack.push(strArray[i]);
        }
        System.out.println(stack);

        Stack<String> reverse = new Stack<>();
        for (int i = 0; i <= stack.size(); i++) {
            var top = stack.pop();
            System.out.println(top);
            reverse.push(top);
        }
        var top = stack.pop();
        System.out.println(top);
        reverse.push(top);
        System.out.println("答え：" + reverse);

    }

}
