class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        int n = changed.length;
        int []vis = new int[(int)1e5+1];
        
        if( n%2!=0 ) return new int[0];
        int []ans = new int[n/2];
        int j = 0;
        
		// filling values in frequency array
        for( int i=0; i<n; i++ ){
            int val = changed[i];
            vis[val]++;
        }
        
        for( int i=0; i<vis.length; i++ ){
			// loop to make the frequency of current element zero
            while( vis[i]>0 ){
                if( i*2<vis.length && vis[i*2]>0 ) {
                    ans[j++] = i;
                    vis[i*2]--;
                }
				// if we cant find the double value for any frequency of ith element return empty array
                else return new int[0];
                
                vis[i]--;
            }
        }
        
        return ans;
    }
}