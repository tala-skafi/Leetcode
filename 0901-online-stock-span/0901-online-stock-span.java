class StockSpanner {
ArrayList<Integer>  array;
    public StockSpanner() {
        array=new ArrayList<>(); 
      
       //array.add(null); 
        
    }
    
    public int next(int price) {
       int counter=1;
        if(array.size()==0){
          array.add(price);  
            return 1;
        }
        if(array.get(array.size()-1)>price) {
            array.add(price);
            return counter;
        }
       for(int i=array.size()-1;i>=0;i--){
           if(price<array.get(i))break;
           else counter++;
       }
        
        
        array.add(price);
        return counter;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */