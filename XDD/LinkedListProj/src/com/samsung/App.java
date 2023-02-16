package com.samsung;

import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        String input = null;
        do {
            input = in.nextLine();
            if (input.equals("pop"))
                System.out.println(stack.pop());
            else if (input.equals("back"))
                System.out.println(stack.peek());
            else if (input.equals("size"))
                System.out.println(stack.size());
            else if (input.equals("clear")) {
                stack.clear();
                System.out.println("ok");
            }
            else if (input.length() > 4) {
                String number = "";
                for (int i = 5; i < input.length(); i++)
                    number += input.charAt(i);
                stack.push(Integer.parseInt(number));
                System.out.println("ok");
            }
        } while (!input.equals("exit"));
        System.out.println("bye");
    }
}
