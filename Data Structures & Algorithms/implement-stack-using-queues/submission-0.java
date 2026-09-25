class MyStack {
    Queue<Integer> q;
    int size;

    public MyStack() {
        q= new LinkedList<Integer>();
        size=0;
        
    }
    
    public void push(int x) {
        q.add(x);
        size++;
        for(int i=0;i<size-1;i++){
            q.add(q.remove());
        }
        
    }
    
    public int pop() {
        if(size==0) return -1;
        int temp= q.remove();
        size--;
        return temp;
        
    }
    
    public int top() {
        if(size==0) return -1;
        return q.peek();
        
    }
    
    public boolean empty() {
        if(size==0)return true;
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