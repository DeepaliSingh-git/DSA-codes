class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a hashmap
        Map<Integer,Integer> count= new HashMap<>();
        for(int a: nums){
            count.put(a, count.getOrDefault(a,0)+1);
        }
        //create an arrayList to store key value
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        //sort by key(frequency)
        arr.sort((a,b)-> b[0]-a[0]);

        //return result
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i]=arr.get(i)[1];
        }
        return res;
    }
}









