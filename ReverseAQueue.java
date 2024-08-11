class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        Deque<Integer> st=new ArrayDeque<>();
        int size=q.size();
        for(int i=0;i<size;i++){
            st.push(q.poll());
        }
        for(int i=0;i<size;i++){
            q.offer(st.pop());
        }
        return q;
    }
}
