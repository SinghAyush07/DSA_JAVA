// learning basic stack

import java.util.Stack;

public class basicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println("Size of Stack: "+st.size());

        // to access first element in stack
        while(st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
