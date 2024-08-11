class Geeks{
    
    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){
        
        q.offer(k);
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        
        int i=0;
        for(int a:q){
            if(a==k)i++;
        }
        return i;
        
    }
    
}
