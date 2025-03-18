import java.util.Stack;

public class Print_Total_Task {
    public static void main(String[] args) {
        int[][] tasks = {
            {1, 5},
            {2, 3},
            {4, 6},
            {7, 10},
            {9, 11},
            {12, 15}
        };
        Stack<Integer> st = new Stack<>();
        st.push(tasks[0][0]);
        st.push(tasks[0][1]);
        for (int i = 1; i < tasks.length; i++) {
            if (tasks[i][0] < st.peek()){
                if (tasks[i][1] > st.peek()){
                    st.pop();
                    st.push(tasks[i][1]);
                }
            }else{
                st.push(tasks[i][0]);
                st.push(tasks[i][1]);
            }
        }
        
        while (!(st.isEmpty())) {
            Integer t1 = st.pop();
            Integer t2 = st.pop();
            System.out.println(t2+" "+t1);
        }


    }
}
