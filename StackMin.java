class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> s = new Stack<>();
        for(Integer x:arr)
            s.push(x);
        return s;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        Stack<Integer> as = new Stack<>();
        as.push(s.get(0));
        int n = s.size();
        for(int i=1; i<n; i++){
            if(s.get(i)<as.peek())
                as.push(s.get(i));
            else
                as.push(as.peek());
        }
        int m = as.size();
        for(int i=0; i<m; i++)
            System.out.print(as.pop()+" ");
    }
}
