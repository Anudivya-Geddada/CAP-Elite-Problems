/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 //Inorder Tree Traversal
*     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Inorder(root,list);
        return list;
        
    }
    public void Inorder(TreeNode root,ArrayList<Integer> list)
    {
        if(root!=null){
            Inorder(root.left,list);
            list.add(root.val);
            Inorder(root.right,list);
        }return;
    }
}