public class StackArrayImplementation {
    static class MyStack {
        int top;
        int cap;
        int arr[];

        MyStack(int cap) {
            top = -1;
            cap = this.cap;
            arr = new int[cap];
        }

        // MyStack methods :: push, pop, isEmpty, peek...
        public void push(int x) {
            if (top == -1)
                return;
            top++;
            arr[top] = x;
        }

        public int pop() {
            int result = arr[top];
            top--;
            return result;
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public int peek() {
            return arr[top];
        }

    }

    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
    }
}
