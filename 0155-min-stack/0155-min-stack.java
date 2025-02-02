class element
{
    int data;
    int min;

    public element(int data, int min) {
        this.data = data;
        this.min = min;
    }
}
class MinStack {

    Stack<element>elements;
    int mn;
    public MinStack() {
        elements=new Stack<>();
        mn=Integer.MAX_VALUE;

    }

    public void push(int val) {
         if (val<mn)
             mn=val;
         elements.push(new element(val,mn));
    }

    public void pop() {
        elements.pop();
        if(!elements.isEmpty())
            mn=elements.peek().min;
        else
        {
           mn=Integer.MAX_VALUE;   // if stack returns to empty one
        }    
    }

    public int top() {
       return elements.peek().data;
    }

    public int getMin() {
       return elements.peek().min;
    }
}