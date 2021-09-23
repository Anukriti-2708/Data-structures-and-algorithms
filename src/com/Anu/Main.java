package com.Anu;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	  Stack<Integer> st = new Stack<>();
	  st.push(10);
	  st.push(20);
	  System.out.println(st);
	  st.push(30);
	  st.push(40);
	  System.out.println(st.peek()+" "+ st.size());
	  st.pop();
	  st.pop();
	  st.pop();
		System.out.println(st.peek()+" "+ st.size());

    }
}
