import java.util.ArrayList;
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> printOut = new ArrayList<Integer>();
        if(root ==null ) return printOut;
        ArrayList<TreeNode> toBePrinted = new ArrayList<TreeNode>();
        toBePrinted.add(root);
        while(!toBePrinted.isEmpty()){
            root = toBePrinted.remove(0);
            printOut.add(root.val);
            if(root.left != null ) toBePrinted.add(root.left);
            if(root.right != null ) toBePrinted.add(root.right);
        }
        return printOut;
    }
}
