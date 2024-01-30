package quiz;
import java.util.Stack;

public class A071_김민혁_20240130 {

    class MyQueue {
        private Stack<Integer> in = new Stack<>();
        private Stack<Integer> out = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            in.push(x);
        }

        public int pop() {
            peek();
            return out.pop();
        }

        public int peek() {
            if (out.empty())
                while (!in.empty())
                    out.push(in.pop());
            return out.peek();
        }

        public boolean empty() {
            return in.empty() && out.empty();
        }
    }
}
