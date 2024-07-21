class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedIntervals = new ArrayList<>();
    //TODO: Write your code here
    int i=0;
    while(i<intervals.length&&intervals[i][1]<newInterval[0]){
      mergedIntervals.add(intervals[i]);
      i++;
    }
    
    while(i<intervals.length&&intervals[i][0]<=newInterval[1]){
      
       newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
      newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
      i++;

    }
    mergedIntervals.add(newInterval);
    while(i<intervals.length){
      mergedIntervals.add(intervals[i]);
      i++;
    }
       int[][] result=mergedIntervals.toArray(new int[0][]);
    return result;
        
    }
}