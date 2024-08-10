public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
{
    Stack<Integer> st=new Stack<>();
    for(Integer a:arr){
        st.push(a);
    }
    return st;
}

public static void _pop(Stack<Integer>s)
{
    int a=s.size();
    for(int i=0;i<a;i++){
        System.out.print(s.pop()+" ");
    }
}
