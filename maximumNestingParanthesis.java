import java.util.Stack;

class Solution {
    public int maxDepth(String s) {
        int max=0;int count=0;
       Stack<Character> st = new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
                count++;
                if(max<count){ 
                   max=count;
                }
            }
            if(ch==')'){
               st.pop();
                count--;
            }
        }
        return max;
    }
}