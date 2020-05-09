package mayChallenge;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    public void insert(TreeNode node, int value) {
        if (value < node.val) { if (node.left != null) { insert(node.left, value); 
        } else { 
        	System.out.println(" Inserted " + value + " to left of " + node.val);
        	node.left = new TreeNode(value); 
        	} } else if (value > node.val) {
          if (node.right != null) {
            insert(node.right, value);
          } else {
            System.out.println("  Inserted " + value + " to right of "
                + node.val);
            node.right = new TreeNode(value);
          }
        }
      }
     public void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.val);
            traverseInOrder(node.right);
        }
     }
}
