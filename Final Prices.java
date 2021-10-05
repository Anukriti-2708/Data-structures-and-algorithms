import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int n=prices.length;
         int[] ans=new int[n];
        for(int i=0;i<prices.length;i++){
            while(st.size()>0 && prices[st.peek()]>=prices[i]){
               ans[st.peek()]=prices[st.peek()]-prices[i];
                st.pop();
            }
            st.push(i);
        }
         while(st.size()>0){
            ans[st.peek()]=prices[st.peek()];
             st.pop();
         }
       
        
        return ans;
    }
    }