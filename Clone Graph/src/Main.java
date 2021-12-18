import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Node> list = new ArrayList<>();

        Node node1 = new Node(2,new ArrayList<>());
        Node node2 = new Node(3,new ArrayList<>());
        Node node3 = new Node(4,new ArrayList<>());
        list.add(node1);list.add(node3);
        Node node = new Node(1,list);
        list.clear();

//        solution.cloneGraph(new Node(1,list));
    }

    public static void traverse(Node node){
        if(node == null)return;

        System.out.println(node.val);
        for(Node nodes: node.neighbors) {
            traverse(nodes);
        }
    }
}
