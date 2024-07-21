class Solution {
    public int[][] kClosest(int[][] points, int k) {
          PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
        int l=points.length;
        int d=0;
        for(int i=0;i<l;i++){
           
              d=points[i][0]*points[i][0] + points[i][1]*points[i][1];
              pq.add(new int[]{i,d});
        }
            int ans[][] = new int[k][2];
        for(int i=0; i<k; i++){
            ans[i] = points[pq.remove()[0]];
        }
        return ans;
            
        }
    }
