class Solution {
    Set<Pair<Integer, Integer>> solutions;
    Set<Integer> visited;
    Map <Integer,List<Integer>> map;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        visited = new HashSet<>();
        solutions = new HashSet<>();
        map = new HashMap<>();
        for(int[]e:edges){
            int s=e[0];
            int d=e[1];
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(d);
            if(!map.containsKey(d)){
                map.put(d,new ArrayList<>());
            }
            map.get(d).add(s);
        } // Printing the map
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        for (int i = 1; i <= n; i++) {
             visited.clear();
            DFS(i, 0);
        }
        for (int i = n - 1; i >= 0; i--) {
            if (solutions.contains(new Pair(edges[i][0], edges[i][1])))
                return edges[i];
        }
        return new int[] { 0, 0 };
    }

    private void DFS(int node, int parent){
        if(visited.contains(node)){
             System.out.println("I'm in "+node+" and parent is "+ parent);
            solutions.add(new Pair(node,parent));
            return;
        }
       
        visited.add(node);
        List<Integer> neighbours=map.get(node);
        if(neighbours!=null)
        for(int n:neighbours){
            if(n!=parent)DFS(n,node);
        }
       
    }
}