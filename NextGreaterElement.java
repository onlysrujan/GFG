class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Deque<Long> st=new ArrayDeque<>();
        long res[]=new long[n];
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.isEmpty()==false && st.peek()<=arr[i]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        return res;
        
    } 
}
