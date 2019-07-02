/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null) return;
        if(root.left == null && root.right == null ) return;
        Change(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    public void Change(TreeNode root){
        TreeNode temp =  root.left;
        root.left = root.right;
        root.right = temp;
    }
}
