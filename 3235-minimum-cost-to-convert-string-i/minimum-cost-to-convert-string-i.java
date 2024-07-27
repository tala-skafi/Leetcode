class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long graph[][] = new long[26][26];
        for(int i = 0; i < 26; i++) {
            Arrays.fill(graph[i], -1l);
        }
        for(int i = 0; i < cost.length; i++) {
            int u = original[i] - 'a';
            int v = changed[i] - 'a';
            long c = cost[i];
            if(graph[u][v] == -1) {
                graph[u][v] = c;
            }
            else {
                graph[u][v] = Math.min(graph[u][v], c);
            }
        }

        for(int k = 0; k < 26; k++) {
            for(int i = 0; i < 26; i++) {
                for(int j = 0; j < 26; j++) {
                    if(graph[i][k] != -1 && graph[k][j] != -1) {
                        if(graph[i][j] == -1) {
                            graph[i][j] = graph[i][k] + graph[k][j];
                        }
                        else {
                            graph[i][j] = Math.min(
                                graph[i][j],
                                graph[i][k] + graph[k][j]
                            );
                        }
                    }
                }
            }
        }

        long totalCost = 0;
        for(int i = 0; i < source.length(); i++) {
            int u = source.charAt(i) - 'a';
            int v = target.charAt(i) - 'a';
            if(u != v) {
                if(graph[u][v] != -1) {
                    totalCost += graph[u][v];
                }
                else {
                    return -1;
                }
            }
        }

        return totalCost;
    }
}