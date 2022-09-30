class Solution {
     HashMap <Integer,List<Integer>> pres;
     HashSet <Integer> visited;
     HashSet <Integer> recHash;
   
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        pres=new HashMap<>();
    visited=new HashSet<>();
    recHash=new HashSet<>();
    int[]result=new int[numCourses];
    int l=prerequisites.length;
    for(int i=0;i<l;i++){
        int source=prerequisites[i][1];
        int to=prerequisites[i][0];
        if(!pres.containsKey(source))pres.put(source,new ArrayList<>());
        pres.get(source).add(to);
 
}
    for(int i=0;i<numCourses;i++){
      //if(!visited.contains(i)) 
      if(!DFS(i))return false;   
}

return true; 
    }
 public boolean DFS(int course){
    if(recHash.contains(course))return false;
    if (visited.contains(course))return true;
    visited.add(course);
    recHash.add(course);
    if(pres.containsKey(course)){//check if it's a source node. if yes, go to all neighbours
        for(int n:pres.get(course)){
            if(!DFS(n))return false;
        }
    }
    recHash.remove(course);
    return true;
}
}