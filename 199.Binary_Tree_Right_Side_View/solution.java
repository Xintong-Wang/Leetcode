/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            while(n > 0){
                root = queue.poll();
                if(root.left != null)
                    queue.offer(root.left);
                if(root.right != null)
                    queue.offer(root.right);
                n--;
                if(n == 0)
                    res.add(root.val);
            }
        }
        return res;
    }
}
