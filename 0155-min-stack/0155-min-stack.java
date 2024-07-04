class MinStack {
   Stack<Integer>stack;
   Stack<Integer>min;
   int mn=Integer.MAX_VALUE;
    public MinStack() {
          stack=new Stack<>();
          min=new Stack<>();
    }

    public void push(int val) {
        if(val<mn)
            mn=val;
          stack.push(val);
          min.push(mn);
    }

    public void pop() {

           stack.pop();
           min.pop();
         if(!min.isEmpty())  
           mn=min.peek();
         else
         mn=Integer.MAX_VALUE;
    }

    public int top() {
         return stack.peek();
    }

    public int getMin() {
         return min.peek();
    }
}