class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            st.push(q.poll());
        }
        for(int a:st){
            q.offer(a);
        }
        for(int i=0;i<q.size()-k;i++){
            q.offer(q.poll());
        }
        return q;
    }
}
