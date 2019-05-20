public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null || pre.length ==0 ||in.length ==0 ) return null;
        return reConstructBTree(pre, 0,pre.length -1 ,in ,0,in.length -1);
    }
    public TreeNode reConstructBTree(int[] pre,int preStart ,int preEnd,int[] in ,int inStart, int inEnd){
        if (inStart > inEnd || preStart > preEnd) return null;
        TreeNode root = new TreeNode(pre[preStart]);
        for(int i=inStart;i<=inEnd;i++){
            if(in[i]== pre[preStart]){
                root.left = reConstructBTree(pre, preStart+1,preStart+i-inStart ,in ,inStart,i-1);
                root.right = reConstructBTree(pre, preStart+i-inStart+1, preEnd,in,i+1,inEnd);
            }
        }
        return root;
    }
}
