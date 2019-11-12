import java.util.Stack;
public class TwoSToQ {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
        if(stack2.size()<=0){
            while(stack1.size()>0){
                stack2.push(stack1.pop());
            }
        }if(stack2.isEmpty()){
            try {
                throw new Exception("queue is empty.");
            } catch (Exception e) {
            }
        }
            int head = stack2.pop();
            return head;
        }
    }

