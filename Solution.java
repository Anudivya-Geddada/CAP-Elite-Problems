class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        postorder(lst,root);
        return lst;
        
    }
    public void postorder(ArrayList<Integer>lst,TreeNode root)
    {
        if(root!=null)
        {
            postorder(lst,root.left);
            postorder(lst,root.right);
            lst.add(root.val);
        }return;
    }
}