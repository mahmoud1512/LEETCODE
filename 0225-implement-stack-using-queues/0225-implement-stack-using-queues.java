class MyStack {


    Queue<Integer>q1;
    
    public MyStack() {

        q1=new ArrayDeque<>();
        
    }

    public void push(int x) {

        q1.add(x);
    }

    public int pop() {

       int siz=q1.size();
        for (int i = 0; i < siz-1; i++) {
            q1.add(q1.poll());
        }
        return q1.poll();
    }

    public int top() {
        int siz=q1.size();
        for (int i = 0; i < siz-1; i++) {
            q1.add(q1.poll());
        }
        int x=q1.peek();
         q1.add(q1.poll());
        return x;
    }

    public boolean empty() {

        return q1.isEmpty();
    }
}