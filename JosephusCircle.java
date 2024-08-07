public static int josephus(int n, int k)
{
    LinkedList<Integer> li=new LinkedList<>();
    for(int i=0;i<n;i++){
        li.add(i);
    }
    Iterator<Integer> it=li.iterator();
    while(li.size()>1){
        int count=0;
        while(count<k){
            while(it.hasNext() && count<k){
                it.next();
                count++;
            }
            if(count<k){
                it=li.iterator();
                it.next();
                count++;
            }
        }
        it.remove();
    }
    return li.getFirst();
}
