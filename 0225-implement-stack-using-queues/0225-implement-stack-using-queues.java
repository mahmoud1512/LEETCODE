class MyStack {


    Queue<Integer>q1;
    Queue<Integer>q2;
    public MyStack() {

        q1=new ArrayDeque<>();
        q2=new ArrayDeque<>();
    }

    public void push(int x) {

        q1.add(x);
    }

    public int pop() {

        if(q2.isEmpty())
        {
            while (q1.size()!=1)
                q2.add(q1.poll());
        }
        Queue<Integer>temp=q1;
        q1=q2;
        q2=temp;
        return q2.poll();
    }

    public int top() {
        if(q2.isEmpty())
        {
            while (q1.size()!=1)
                q2.add(q1.poll());
        }
        Queue<Integer>temp=q1;
        q1=q2;
        q2=temp;
        int x=q2.poll();
        q1.add(x);
        return x;
    }

    public boolean empty() {

        return q1.isEmpty()&&q2.isEmpty();
    }
}