class element
{
    int data;
    int min;
}

class MinStack {

    Stack<element>elementStack;

    public MinStack() {
        elementStack=new Stack<>();
    }

    public void push(int val) {
        element e=new element();
        e.data=val;
        if (elementStack.isEmpty())
        {
            e.min=val;
        }
        else
        {
            e.min=Math.min(val,elementStack.peek().min);
        }
        elementStack.push(e);
    }

    public void pop() {
       elementStack.pop();
    }

    public int top() {
         return elementStack.peek().data;
    }

    public int getMin() {
         return elementStack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */