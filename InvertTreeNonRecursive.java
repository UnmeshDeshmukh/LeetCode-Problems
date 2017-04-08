
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//to
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1




import java.util.LinkedList;
import java.util.Queue;

public class InvertTreeNonRecursive {
    public TreeNode inverTreeIterative(TreeNode root){
        Queue<TreeNode> queueOfNodes = new LinkedList<TreeNode>();
        queueOfNodes.add(root);
        while(!queueOfNodes.isEmpty()){
            TreeNode current = queueOfNodes.poll();
            TreeNode temp = current.left;
            current.right = current.left;
            current.left = temp;
            if(current.left!=null)
                queueOfNodes.add(current.left);
            if(current.right!=null)
                queueOfNodes.add(current.right);
        }
        return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
