public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
{
    ArrayList<Integer> al=new ArrayList<>();
    
    for(int i=0;i<arr.size();i++){
        int count=0;
        for(int j=0;j<(arr.get(i)).size();j++){
            try{
                al.set(count,al.get(count)+(arr.get(i)).get(j));
            }catch(Exception e){
                al.add(count,(arr.get(i)).get(j));
            }
            count++;
        }
    }
    int min=Integer.MAX_VALUE;
    for(int a:al){
        if(min>a)min=a;
    }
    return min;
}
