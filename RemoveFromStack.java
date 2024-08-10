class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        int mid=((sizeOfStack)/2);
        if(sizeOfStack%2==0) s.remove(mid-1);
        else s.remove(mid);
    }
}
