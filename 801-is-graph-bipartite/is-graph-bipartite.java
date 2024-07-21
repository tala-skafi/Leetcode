public class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n]; // Array to store colors of nodes, 0: not colored, 1: color 1, -1: color -1
        Arrays.fill(colors, 0); // Initially all nodes are not colored

        for (int i = 0; i < n; i++) {
            if (colors[i] == 0 && !bfs(graph, colors, i)) // If the node is not colored and coloring it results in conflict
                return false;
        }
        return true;
    }
    private boolean bfs(int[][] graph, int[] colors, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        colors[start] = 1; // Color the start node with color 1

        while (!queue.isEmpty()) {
            int node = queue.poll();
            int currentColor = colors[node];

            for (int neighbor : graph[node]) {
                if (colors[neighbor] == currentColor) // If the neighbor has the same color as the current node
                    return false; // Conflict, not bipartite
                else if (colors[neighbor] == 0) { // If the neighbor is not colored yet
                    colors[neighbor] = -currentColor; // Color it with the opposite color
                    queue.offer(neighbor);
                }
            }
        }
        return true; // No conflicts, bipartite
    }

}
