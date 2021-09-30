package com.Anu;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr =new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int[]span=new int[arr.length];
        Stack <Integer> st=new Stack<>();
        st.push(0);
        span[0]=1;
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                span[i]=i+1;
            }else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(span[i]);
    }
}

//