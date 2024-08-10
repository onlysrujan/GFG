class Solution
{
    static boolean isMatching(char a,char b){
        return (a=='[' && b==']' ||
        a=='{' && b=='}' ||
        a=='(' && b==')');
    }
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='(' || ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()==true){
                    return false;
                }else if(isMatching(st.peek(),ch)==false){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        return (st.isEmpty()==true);
    }
}
