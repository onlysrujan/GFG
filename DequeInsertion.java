class Solution {
    // Function to insert all elements of the array in deque.
    public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
        // Your code here
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        for(int a:arr){
            ad.add(a);
        }
        return ad;
    }
}
