/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Node[] clones = new Node[101]; // Assuming node values range from 0 to 100
    
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        
        // Use a queue for BFS traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        // Clone the initial node
        clones[node.val] = new Node(node.val);
        
        // BFS traversal
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            
            // Iterate through each neighbor of the current node
            for (Node neighbor : current.neighbors) {
                // If the neighbor is not cloned yet, clone and add to the queue
                if (clones[neighbor.val] == null) {
                    clones[neighbor.val] = new Node(neighbor.val);
                    queue.add(neighbor);
                }
                // Add the clone of the neighbor to the neighbors of the current node's clone
                clones[current.val].neighbors.add(clones[neighbor.val]);
            }
        }
        
        return clones[node.val];
    }
}