class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;
    public MyStack() {
        q1=new LinkedList<>(); 
        q2=new LinkedList<>(); 
    }
    
    public void push(int x) {
        top=x;
        if(q1.isEmpty() && q2.isEmpty()){
            q1.offer(x);
        }
        else if(q1.isEmpty()){
            q2.offer(x);
        }
        else if(q2.isEmpty()){
            q1.offer(x);
        }
    }
    
    public int pop() {
        if(q1.isEmpty() && q2.isEmpty()){
            return 0;
        }
        else if(q1.isEmpty()){
            return getTopFromQueue(q2,q1);
        }
        else if(q2.isEmpty()){
            return getTopFromQueue(q1,q2);
        }
        return 0;
    }
    
    private int getTopFromQueue(Queue<Integer> data, Queue<Integer> aux){
        var size=data.size();
        for(int i=0;i<size-1;i++){
            top=data.poll();
            aux.offer(top);
        }
        return data.poll();
    }
    public int top() {
        return top;
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */