/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        preorder(result,root);
        return result;
    }
    private void preorder(ArrayList<Integer> arr,TreeNode root){
        if(root==null){
            return;
        }
        arr.add(root.val);
        preorder(arr,root.left);
        preorder(arr,root.right);
    }
}