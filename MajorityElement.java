
class Solution
{
    static int majorityElement(int a[], int size)
    {
        if(size==1)return a[0];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<size;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }else{
                hm.put(a[i],1);
            }
        }
        for(int aa:hm.keySet()){
            int b=hm.get(aa);
            if(b>size/2)return aa;
        }
        return -1;
    }
}
