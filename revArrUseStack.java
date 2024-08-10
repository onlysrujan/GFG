class Solution
{
    public static void reverseArray(int n, int arr[])
    {
        Stack<Integer> st=new Stack<>();
        for(int a:arr){
            st.push(a);
        }
        int a=st.size();
        for(int i=0;i<a;i++){
            arr[i]=st.pop();   
        }
    }
}
