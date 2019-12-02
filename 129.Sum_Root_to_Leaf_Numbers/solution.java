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
    public int sumNumbers(TreeNode root) {
        return recSum(root, 0);
    }
    private int recSum(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return recSum(root.left, sum) + recSum(root.right, sum);
    }
}
