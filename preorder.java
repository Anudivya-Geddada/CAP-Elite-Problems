#Binary Tree Preorder
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        preorder(root,list);
        return list;

        
    }
    public void preorder(TreeNode root , ArrayList<Integer> list){
        if(root!=null){
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
        }return;
    }
}