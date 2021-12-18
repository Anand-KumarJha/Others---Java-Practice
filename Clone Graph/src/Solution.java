import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null)return null;

        Node newNode = new Node(node.val);
        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        map.put(node,newNode);
        queue.add(node);

        while(!queue.isEmpty()){
            Node originalNode = queue.poll();
            for(Node originalNeighbor: originalNode.neighbors){
                if(!map.containsKey(originalNeighbor)){
                    Node newNeighbor = new Node(originalNeighbor.val);
                    map.put(originalNeighbor,newNeighbor);
                    queue.add(originalNeighbor);
                }
                map.get(originalNode).neighbors.add(map.get(originalNeighbor));
            }

        }
        return newNode;
    }
}