class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue <Integer> q= new LinkedList<>();
        Queue <Integer> p=new LinkedList<>();
        HashSet <Integer> set=new HashSet<>();
        Queue <Integer> temp;
        q.add(source);
        while(!q.isEmpty()){
            //1.pop front
            int front=q.poll();
            set.add(front);
            //2.check goal
            if(front==destination)return true;
            //3.check neighbors
            for(int i=0;i<edges.length;i++){
                if(edges[i][0]==front&&!set.contains(edges[i][1]))p.add(edges[i][1]);
                if(edges[i][1]==front&&!set.contains(edges[i][0]))p.add(edges[i][0]);  
                    
            }
            //4.check level over
            if(q.isEmpty()){
                temp=q;
                q=p;
                p=temp;  
            }
        }
        return false;
    }
}