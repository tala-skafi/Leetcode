class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals, (a,b) ->Integer.compare(a[0],b[0]));
        list.add(intervals[0]);
        int []check;
        for(int[] interval:intervals){
            check=list.get(list.size()-1);
            if(interval[0]<=check[1]){
                list.remove(list.size()-1);
                list.add(new int[]{check[0],Math.max(check[1],interval[1])});
            }
            else {
                list.add(interval);
            }
        }
        return list.toArray(new int[list.size()][]);
        
    }
}