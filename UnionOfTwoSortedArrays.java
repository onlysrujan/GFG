class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int a:arr1){
            hs.add(a);
        }
        for(int b:arr2){
            hs.add(b);
        }
        Iterator<Integer> it=hs.iterator();
        while(it.hasNext()){
            al.add(it.next());
        }
        Collections.sort(al);
        return al;
        
  
