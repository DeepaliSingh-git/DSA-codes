/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node,Node> map=new HashMap<>();
    public Node copyRandomList(Node node1) {
        
        if(node1==null) return null;
        if(map.containsKey(node1)) return map.get(node1);
        
        Node copy = new Node(node1.val);
        map.put(node1,copy);
        copy.next = copyRandomList(node1.next);
        copy.random= map.get(node1.random);
        return copy;
    }
}
