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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> Post = new ArrayList<>();
        if(root == null){
            return Post;
        }
        List<Integer> lh=postorderTraversal(root.left);
        List<Integer> rh=postorderTraversal(root.right);
        Post.addAll(lh);
        Post.addAll(rh);
        Post.add(root.val);
        return Post;
    }
}