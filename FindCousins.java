package mayChallenge;

public class FindCousins {
	
    static TreeNode parentx = null;
	static TreeNode parenty = null;
    static int depthx;
	static int depthy = -1;
    public static boolean isCousins(TreeNode root, int x, int y) {
    	boolean ans = false;
    	if(root.val == x || root.val == y) return false;

    	findDepth(root, null, 0, x, y);

    	
    	return depthx == depthy &&  parentx != parenty;
    }
    
        public static void findDepth(TreeNode curr, TreeNode parent, int depth, int x, int y) {
    	
    	if(curr == null) return;
        if(curr.val == x) {
            parentx = parent;
            depthx = depth;
        } else if(curr.val == y) {
            parenty = parent;
            depthy = depth;
        } else {
            findDepth(curr.left, curr, depth+1, x,y );
            findDepth(curr.right, curr, depth+1, x,y );
        }
    	
    }
//    static int parentxvalue = 0;
//    static int parentyvalue = 0;
//    public static boolean isCousins(TreeNode root, int x, int y) {
//    	boolean ans = false;
//    	if(root.val == x || root.val == y) return false;
//    	int parentx = -1;
//    	int depthx = findDepth(root, parentx, 0, x);
//    	
//    	int parenty = -1;
//    	int depthy = findDepth(root, parenty, 0, y);
//    	
//    	if(depthx == depthy &&  parentxvalue != parentyvalue) {
//    		ans = true;
//    	} else {
//    		ans = false;
//    	}
//	
//        return ans;
//    }
//    
//    public static int findDepth(TreeNode curr, int parent, int depth, int value) {
//    	int res = 0;
//    	if(curr == null) return 0;
//    	if(curr.val == value) {
//    		
//    	}return depth;
//    	    	
//    	    	parent = curr.val;
//    	    	int left = findDepth(curr.left, curr.left.val, depth+1, value);
//    	    	if(left != 0) {
//    	    		res = left;
//    	    		parentxvalue = parent;
//    	    	} else {
//    	    		parent= curr.val;
//    	    		left = findDepth(curr.right, curr.right.val, depth+1, value);
//    	    		if(left != 0) {
//    	    			res = left;
//    	    			parentyvalue = parent;
//    	    		}
//    	    	}
//    		
//
//
//    	return res;
//    	
//    }
//    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode();
		TreeNode root = new TreeNode(5);
		root.insert(root, 2);
		root.insert(root, 2);
		root.insert(root, 4);
		root.insert(root, 8);

        root.insert(root, 9);
        System.out.println("Traversing tree in order");
        root.traverseInOrder(root);
        boolean result = isCousins(root, 4,9);
        System.out.println(result);
	}

}
