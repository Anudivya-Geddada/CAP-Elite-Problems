class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int qlen = queue.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<qlen;i++){
                TreeNode curr = queue.remove();
                sublist.add(curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);

                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            list.add(sublist);
        }
        return list;
    }
}