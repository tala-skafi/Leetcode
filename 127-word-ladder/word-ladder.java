class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int level=0;
        int index=0;
        Queue<String>p=new LinkedList<>();
        Queue<String>q=new LinkedList<>();
        Set<String> set=new HashSet<>();

        p.add(beginWord);
    while(!p.isEmpty()){
    //1.pop front
    String front=p.poll();
    //2.check if goal
    if(front.equals(endWord)){
        return level+1;
    }
    //3.check neighbours
    for(int i=0;i<wordList.size();i++){
      if(!set.contains(wordList.get(i)))
      if(check(wordList.get(i),front)){
         q.add(wordList.get(i));
         set.add(wordList.get(i));
    }
    
}
    //4.check if level over
     if(p.isEmpty()){
      level++;
       p=q;
       q=new LinkedList<>();
 }   
    
    

}

return 0;
        
    }
    public boolean check(String current, String front){
    int count=0;
    for(int i=0;i<current.length();i++){
        if(current.charAt(i)!=front.charAt(i))count++;
    }
    return count==1;
}

}