package com.Anu;


import java.io.*;
import java.util.*;

public class BracketDuplicate {
    public static void Duplicates(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Integer>st=new Stack<>();
        for (int i=0; i<str.length();i++){
            int ch = str.charAt(i);
            if(ch==')'){
                if (st.peek() == '('){
                    System.out.println(true);
                    return;
                }else{
                    while(st.peek()!='(')
                    st.pop ();
                }
                st.pop();
            }else{
                st.push(ch);
            }
        }
       System.out.println(false);
    }
}
